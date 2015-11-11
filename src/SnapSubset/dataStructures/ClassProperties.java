/* 
 *  
 * ClassProperties.java
 *  
 * written by Adrian Hintze
 *  
 * Copyright (c) 2015 by Adrian Hintze
 * 
 * This file is a part of Snapp!
 * 
 * Snapp! is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.Utils;


public class ClassProperties {

	/* private attributes */
	
	private Map<String, ClassInfo> properties;
	
	
	/* constructors */
	
	public ClassProperties() {
		this.properties = new HashMap<String, ClassInfo>();
	}
	
	public ClassProperties(ClassProperties cp) {
		this.properties = new HashMap<String, ClassInfo>();
		this.addPropertiesCopy(cp);
	}
	
	public ClassProperties(List<ClassInfo> pl) {
		this.properties = new HashMap<String, ClassInfo>();
		this.addProperties(pl);
	}
	
	
	/* public methods */
	
	public ClassInfo getProperty(String id) {
		return this.properties.get(id);
	}
	
	public List<ClassInfo> getAllProperties() {
		return new ArrayList<ClassInfo>(this.properties.values());
	}
	
	public void addProperty(ClassInfo prop) {
		if (prop == null || Utils.isEmptyString(prop.getName())) return;
		this.properties.put(prop.getName(), prop);
	}
	
	public void addPropertyCopy(ClassInfo prop) {
		if (prop == null || Utils.isEmptyString(prop.getName())) return;
		ClassInfo copy = new ClassInfo(prop);
		this.properties.put(copy.getName(), copy);
	}
	
	public void addProperties(ClassProperties cp) {
		if (cp == null) return;
		for (ClassInfo c : cp.getAllProperties()) {
			this.addProperty(c);
		}
	}
	
	public void addPropertiesCopy(ClassProperties cp) {
		if (cp == null) return;
		for (ClassInfo c : cp.getAllProperties()) {
			this.addPropertyCopy(c);
		}
	}
	
	public void addProperties(List<ClassInfo> pl) {
		if (pl == null) return;
		for (ClassInfo c : pl) {
			this.addProperty(c);
		}
	}
	
	public Boolean isEmpty() {
		return this.properties.isEmpty();
	}
	
	public Integer size() {
		return this.properties.size();
	}
	
}
