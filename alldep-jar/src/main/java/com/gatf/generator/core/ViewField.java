/*
    Copyright 2013-2019, Sumeet Chhetri
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/
package com.gatf.generator.core;

/**
 * @author Sumeet Chhetri<br/>
 * The Form element class provides data for generating actual form fields
 */
@SuppressWarnings("rawtypes")
public class ViewField {
	
	private String name;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	private Class claz;
	
	private Object value;

	/**
	 * @return the claz
	 */
	public Class getClaz() {
		return claz;
	}

	/**
	 * @param claz the claz to set
	 */
	public void setClaz(Class claz) {
		this.claz = claz;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
