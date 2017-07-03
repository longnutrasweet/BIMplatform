package cn.dlb.bim.ifc.stream.serializers;

/******************************************************************************
 * Copyright (C) 2009-2016  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import java.io.InputStream;
import java.io.OutputStream;

import cn.dlb.bim.ifc.database.DatabaseException;
import cn.dlb.bim.ifc.emf.PackageMetaData;
import cn.dlb.bim.ifc.model.IfcHeader;
import cn.dlb.bim.ifc.serializers.SerializerException;
import cn.dlb.bim.ifc.stream.ObjectProvider;
import cn.dlb.bim.service.PlatformService;

public interface StreamingSerializer {
	void init(PlatformService platformService, ObjectProvider objectProvider, IfcHeader ifcHeader, PackageMetaData packageMetaData) throws SerializerException;
	void writeToOutputStream(OutputStream outputStream) throws SerializerException, DatabaseException;
	InputStream getInputStream();
}