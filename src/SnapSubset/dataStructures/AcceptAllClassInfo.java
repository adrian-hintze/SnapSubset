/* 
 *  
 * AcceptAllClassInfo.java
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

import java.util.List;


public class AcceptAllClassInfo extends ClassInfo {

	/* constructors */
	
	public AcceptAllClassInfo() {
		super();
	}
	
	public AcceptAllClassInfo(String name) {
		super(name);
	}	
	
	public AcceptAllClassInfo(String name, ClassParents parentClasses) {
		super(name, parentClasses);
	}
	
	public AcceptAllClassInfo(String name, List<String> parentClasses, List<ClassInfo> attributes) {
		super(name, parentClasses, attributes);
	}
	
	
	/* public methods */
	
	@Override
	public ClassInfo getProperty(String id) {
		return new AcceptAllClassInfo(id, new ClassParents("Joker"));
	}
	
	@Override
	public ClassInfo getParameter(String id) {
		return new AcceptAllClassInfo(id, new ClassParents("Joker"));
	}
	
}
