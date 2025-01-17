/*******************************************************************************
* Copyright (c) 2018 IBM Corporation and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     IBM Corporation - initial API and implementation
*******************************************************************************/
package io.openliberty.guides.application;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


public class CrewMember {

	@NotEmpty(message = "All crew members must have a name!")
	private String name;

	@Pattern(regexp = "(Captain|Officer|Engineer)", message = "Crew member must be one of the listed ranks!")
	private String rank;

	@Pattern(regexp = "^\\d+$", message = "ID Number must be a non-negative integer!")
	private String crewID; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getCrewID(){
		return crewID;
	}

	public void setCrewID(String crewID) {
		this.crewID = crewID;
	}

}