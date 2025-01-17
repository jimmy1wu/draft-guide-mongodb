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

import javax.enterprise.context.ApplicationScoped;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;

@Path("/")
@ApplicationScoped
public class CrewService {

	@POST
	@Path("/{id}")
	public String add() {
		return "";
	}

	@DELETE
	@Path("/{id}")
	public String remove() {
		return "";
	}

	@PUT
	@Path("/{id}")
	public String update() {
		return "";
	}

	@GET
	public String retrieve() {
		return "";
	}
}