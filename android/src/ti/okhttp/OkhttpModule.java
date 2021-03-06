/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2015 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 * 
 */
package ti.okhttp;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;


@Kroll.module(name="Okhttp", id="ti.okhttp")
public class OkhttpModule extends KrollModule
{
	// These properties are only available in TiC from 5.0.0.GA onwards
	// Property added here to allow for backward compatibility with 4.1.0.GA.
	public static final String PROPERTY_ONSENDSTREAM = "onsendstream";
	public static final String PROPERTY_ONREADYSTATECHANGE = "onreadystatechange";
	public static final String PROPERTY_ONERROR = "onerror";
	public static final String PROPERTY_ONDATASTREAM = "ondatastream";
	public static final String PROPERTY_ONLOAD = "onload";
	
	@Kroll.constant public static final int PROGRESS_UNKNOWN = -1;

	public OkhttpModule()
	{
		super();
	}

}

