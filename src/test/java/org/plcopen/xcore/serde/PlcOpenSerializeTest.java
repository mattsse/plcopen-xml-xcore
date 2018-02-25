package org.plcopen.xcore.serde;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.plcopen.xml.tc60201.serde.PlcOpenSerializer;
import org.plcopen.xml.tc60201.util.Tc60201ResourceFactoryImpl;

public class PlcOpenSerializeTest {
	ResourceSet resourceSet = null;

	@Before
	public void setUp() throws Exception {
		resourceSet = new ResourceSetImpl();

		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap().put("xml", new Tc60201ResourceFactoryImpl());
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}

	@Test
	public void loadXmlTest() throws IOException {
		File xmlFile = new File("examples/minimal.xml");
		PlcOpenSerializer serializer = new PlcOpenSerializer();
		Resource resource = serializer.loadXmlResource(xmlFile);
		Assert.assertNotNull(resource);

	}

	@Test
	public void serializeTest() throws IOException {
		File xmlFile = new File("examples/minimal.xml");
		PlcOpenSerializer serializer = new PlcOpenSerializer();
		serializer.writeXMI(xmlFile, resourceSet, "generated/demo_xmi.xmi");
		Resource resource = serializer.loadXmiResource(new File("generated/demo_xmi.xmi"));
		Assert.assertNotNull(resource);
		resource.save(null);
	}

	@Test
	public void roundtripTest() throws IOException {
		File xmlFile = new File("examples/minimal.xml");
		PlcOpenSerializer serializer = new PlcOpenSerializer();
		serializer.writeXMI(xmlFile, resourceSet, "generated/demo_xmi.xmi");

		URI modelURI = URI.createFileURI(new File("generated/demo_xmi.xmi").getAbsolutePath());
		serializer.writeXML(resourceSet.getResource(modelURI, true), "generated/demo_generated.xml");
	}

}
