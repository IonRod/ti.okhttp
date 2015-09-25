/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2015 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 * 
 * Copied and modified from Apache's HTTPClient implementation (APL2 license):
 * org.apache.http.entity.mime.content.FileBody
 */
package httpurlconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import okio.BufferedSink;

public class FileBody extends AbstractContentBody{

private final File file;
    
    public FileBody(final File file, final String mimeType) {
        super(mimeType);
        if (file == null) {
            throw new IllegalArgumentException("File may not be null");
        }
        this.file = file;
    }
    
    public FileBody(final File file) {
        this(file, "application/octet-stream");
    }
    
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    /**
     * @deprecated use {@link #writeTo(OutputStream)}
     */
    @Deprecated
    public void writeTo(final OutputStream out, int mode) throws IOException {
        writeTo(out);
    }


    public String getTransferEncoding() {
    	return "binary";
        //return MIME.ENC_BINARY;
    }

    public String getCharset() {
        return null;
    }

    public long getContentLength() {
        return this.file.length();
    }
    
    public String getFilename() {
        return this.file.getName();
    }
    
    public File getFile() {
        return this.file;
    }

	@Override
	public void writeTo(OutputStream out) throws IOException {
        if (out == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream in = new FileInputStream(this.file);
        try {
            byte[] tmp = new byte[4096];
            int l;
            while ((l = in.read(tmp)) != -1) {
            	out.write(tmp, 0, l);
            }
            out.flush();
        } finally {
            in.close();
        }
	}
}
