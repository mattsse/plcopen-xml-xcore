package org.plcopen.xml.tc60201.serde;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.util.Tc60201ResourceImpl;
import org.plcopen.xml.tc60201.util.Tc60201XMLProcessor;

public class PlcOpenSerializer {

	/**
	 * Saves the xmi modelFile to a PlcOpen XML file. Loads the Resource from the
	 * xmlFile first and then saves it as xmi
	 * 
	 * @param xmlFile
	 * @param resourceSet
	 * @param modelFile
	 * @throws IOException
	 */
	public void writeXMI(File xmlFile, ResourceSet resourceSet, String modelFile) throws IOException {
		Resource plcResource = loadXMLResource(xmlFile);
		URI modelURI = URI.createFileURI(new File(modelFile).getAbsolutePath());
		Resource xmiResource = resourceSet.createResource(modelURI);
		xmiResource.getContents().add(EcoreUtil.copy(plcResource.getContents().get(0).eContents().get(0)));
		xmiResource.save(null);
	}

	/**
	 * Loads a PlcOpen Xml file to an emf Resource
	 * 
	 * @param xmlFile
	 * @return
	 * @throws IOException
	 */
	public Resource loadXMLResource(File xmlFile) throws IOException {
		FileInputStream stream = new FileInputStream(xmlFile);

		Tc60201XMLProcessor processor = new Tc60201XMLProcessor();

		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(processor.getEPackageRegistry());
		// put metadata options
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		Resource plcResource = processor.load(stream, options);

		return plcResource;
	}

	/**
	 * Loads a PlcOpen Xmi file to an emf Resource
	 * 
	 * @param xmiFile
	 * @return
	 * @throws IOException
	 */
	public Resource loadXMIResource(File xmiFile) throws IOException {
		final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Tc60201Package.eINSTANCE.eClass();
		final Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(Tc60201Package.eINSTANCE.getName(), new XMIResourceFactoryImpl());
		m.put("xmi", new XMIResourceFactoryImpl());
		m.put("*", new XMIResourceFactoryImpl());
		final ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(xmiFile.getAbsolutePath()), true);
		return resource;
	}

	/**
	 * Saves an emf Resource model to a PlcOpen Xml file
	 * 
	 * @param xmiResource
	 * @param xmlFile
	 * @throws IOException
	 */
	public void writeXML(Resource xmiResource, String xmlFile) throws IOException {
		// create the resource set and register the metamodel packages
		xmiResource.getResourceSet().getPackageRegistry().put(Tc60201Package.eINSTANCE.getNsURI(),
				Tc60201Package.eINSTANCE);
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(
				xmiResource.getResourceSet().getPackageRegistry());
		// put metadata options
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		URI xmlURI = URI.createFileURI(new File(xmlFile).getAbsolutePath());
		Tc60201ResourceImpl plcResource = new Tc60201ResourceImpl(xmiResource.getURI());

		plcResource.getContents().add(EcoreUtil.copy(xmiResource.getContents().get(0)));
		plcResource.setURI(xmlURI);
		plcResource.save(options);

	}

}
