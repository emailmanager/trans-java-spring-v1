// The MIT License
//
// Copyright (c) 2010 Jared Holdcroft
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.

/* Emailmanager for Java / Spring
 * <p/>
 * This library can be used to leverage the emailmanager.com functionality from a Java client
 * <p/>
 *
 * https://github.com/Imaginatio/emailmanager-java
 * forked from https://github.com/bitformed/emailmanager-java
 */

package com.emailmanager;

import org.springframework.mail.SimpleMailMessage;

/**
 * Wrapper class for Emailmanager message
 */
public class EmailmanagerMessage extends SimpleMailMessage {
	
	private String tag;

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}
	
	

}


