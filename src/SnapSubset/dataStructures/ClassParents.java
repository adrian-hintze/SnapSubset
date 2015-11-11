/* 
 *  
 * ClassParents.java
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ClassParents {

	/* private attributes */
	
	private Set<String> parents;
	
	/* constructors */
	
	public ClassParents() {
		this.parents = new HashSet<String>();
	}
	
	public ClassParents(String parent) {
		this.parents = new HashSet<String>();
		this.parents.add(parent);
	}
	
	public ClassParents(List<String> pl) {
		this.parents = new HashSet<String>();
		this.addParents(pl);
	}
	
	public ClassParents(ClassParents cp) {
		this.parents = new HashSet<String>();
		this.addParents(cp);
	}
	
	
	/* public methods */
	
	public Boolean containsParent(String p) {
		return this.parents.contains(p);
	}
	
	public List<String> getAllParents() {
		return new ArrayList<String>(this.parents);
	}
	
	public void addParent(String p) {
		this.parents.add(p);
	}
	
	public void addParents(ClassParents cp) {
		if (cp == null) return;
		for (String s : cp.getAllParents()) {
			this.addParent(s);
		}
	}
	
	public void addParents(List<String> pl) {
		if (pl == null) return;
		for (String c : pl) {
			this.addParent(c);
		}
	}
	
	public Boolean isEmpty() {
		return this.parents.isEmpty();
	}
	
	public Integer size() {
		return this.parents.size();
	}
	
}
