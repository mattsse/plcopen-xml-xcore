/**
 */
package org.plcopen.xml.tc60201.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.plcopen.xml.tc60201.AccessVariable;
import org.plcopen.xml.tc60201.ActionBlock;
import org.plcopen.xml.tc60201.ActionObject;
import org.plcopen.xml.tc60201.Actions;
import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.AddDataInfo;
import org.plcopen.xml.tc60201.Array;
import org.plcopen.xml.tc60201.ArrayValue;
import org.plcopen.xml.tc60201.Block;
import org.plcopen.xml.tc60201.Body;
import org.plcopen.xml.tc60201.Coil;
import org.plcopen.xml.tc60201.Comment;
import org.plcopen.xml.tc60201.Condition;
import org.plcopen.xml.tc60201.ConfigVariable;
import org.plcopen.xml.tc60201.Configuration;
import org.plcopen.xml.tc60201.Configurations;
import org.plcopen.xml.tc60201.Connection;
import org.plcopen.xml.tc60201.ConnectionPointIn;
import org.plcopen.xml.tc60201.ConnectionPointOut;
import org.plcopen.xml.tc60201.ConnectionPointOutAction;
import org.plcopen.xml.tc60201.Connector;
import org.plcopen.xml.tc60201.Contact;
import org.plcopen.xml.tc60201.ContentHeader;
import org.plcopen.xml.tc60201.Continuation;
import org.plcopen.xml.tc60201.CoordinateInfo;
import org.plcopen.xml.tc60201.Data;
import org.plcopen.xml.tc60201.DataType;
import org.plcopen.xml.tc60201.DataTypeType;
import org.plcopen.xml.tc60201.DataTypes;
import org.plcopen.xml.tc60201.Derived;
import org.plcopen.xml.tc60201.DocumentRoot;
import org.plcopen.xml.tc60201.EnumerationValue;
import org.plcopen.xml.tc60201.ExternalVars;
import org.plcopen.xml.tc60201.FBD;
import org.plcopen.xml.tc60201.FbdTypeInfo;
import org.plcopen.xml.tc60201.FileHeader;
import org.plcopen.xml.tc60201.FormalConnectionPointOut;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.GlobalVars;
import org.plcopen.xml.tc60201.InOutVariable;
import org.plcopen.xml.tc60201.InOutVariables;
import org.plcopen.xml.tc60201.InOutVars;
import org.plcopen.xml.tc60201.InVariable;
import org.plcopen.xml.tc60201.Info;
import org.plcopen.xml.tc60201.Inline;
import org.plcopen.xml.tc60201.InputOutputVariable;
import org.plcopen.xml.tc60201.InputVariable;
import org.plcopen.xml.tc60201.InputVariables;
import org.plcopen.xml.tc60201.InputVars;
import org.plcopen.xml.tc60201.Instances;
import org.plcopen.xml.tc60201.Interface;
import org.plcopen.xml.tc60201.Jump;
import org.plcopen.xml.tc60201.JumpStep;
import org.plcopen.xml.tc60201.LD;
import org.plcopen.xml.tc60201.Label;
import org.plcopen.xml.tc60201.LdTypeInfo;
import org.plcopen.xml.tc60201.LeftPowerRail;
import org.plcopen.xml.tc60201.LocalVars;
import org.plcopen.xml.tc60201.MacroStep;
import org.plcopen.xml.tc60201.MemberValue;
import org.plcopen.xml.tc60201.OutVariable;
import org.plcopen.xml.tc60201.OutputVariable;
import org.plcopen.xml.tc60201.OutputVariables;
import org.plcopen.xml.tc60201.OutputVars;
import org.plcopen.xml.tc60201.PageSize;
import org.plcopen.xml.tc60201.Pointer;
import org.plcopen.xml.tc60201.Position;
import org.plcopen.xml.tc60201.Pou;
import org.plcopen.xml.tc60201.PouAction;
import org.plcopen.xml.tc60201.PouInstance;
import org.plcopen.xml.tc60201.PouTransition;
import org.plcopen.xml.tc60201.Pous;
import org.plcopen.xml.tc60201.Project;
import org.plcopen.xml.tc60201.RangeSigned;
import org.plcopen.xml.tc60201.RangeUnsigned;
import org.plcopen.xml.tc60201.Reference;
import org.plcopen.xml.tc60201.RepititionValue;
import org.plcopen.xml.tc60201.Resource;
import org.plcopen.xml.tc60201.ReturnType;
import org.plcopen.xml.tc60201.RightPowerRail;
import org.plcopen.xml.tc60201.SFC;
import org.plcopen.xml.tc60201.Scaling;
import org.plcopen.xml.tc60201.SelectionConvergence;
import org.plcopen.xml.tc60201.SelectionDivergenceType;
import org.plcopen.xml.tc60201.SfcTransition;
import org.plcopen.xml.tc60201.SfcTransitions;
import org.plcopen.xml.tc60201.SfcTypeInfo;
import org.plcopen.xml.tc60201.SimpleValue;
import org.plcopen.xml.tc60201.SimultaneousConvergence;
import org.plcopen.xml.tc60201.SimultaneousDivergence;
import org.plcopen.xml.tc60201.Step;
import org.plcopen.xml.tc60201.StringType;
import org.plcopen.xml.tc60201.StructValue;
import org.plcopen.xml.tc60201.SubrangeSigned;
import org.plcopen.xml.tc60201.SubrangeUnsigned;
import org.plcopen.xml.tc60201.TaskType;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.TempVars;
import org.plcopen.xml.tc60201.Types;
import org.plcopen.xml.tc60201.Value;
import org.plcopen.xml.tc60201.Values;
import org.plcopen.xml.tc60201.VarList;
import org.plcopen.xml.tc60201.VarListAccess;
import org.plcopen.xml.tc60201.VarListConfig;
import org.plcopen.xml.tc60201.VarListPlain;
import org.plcopen.xml.tc60201.VariableType6;
import org.plcopen.xml.tc60201.VendorElement;
import org.plcopen.xml.tc60201.Vergence;
import org.plcopen.xml.tc60201.Wstring;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.plcopen.xml.tc60201.Tc60201Package
 * @generated
 */
public class Tc60201Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tc60201Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tc60201Switch() {
		if (modelPackage == null) {
			modelPackage = Tc60201Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Tc60201Package.ACCESS_VARIABLE: {
				AccessVariable accessVariable = (AccessVariable)theEObject;
				T result = caseAccessVariable(accessVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ACTION_BLOCK: {
				ActionBlock actionBlock = (ActionBlock)theEObject;
				T result = caseActionBlock(actionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ACTIONS: {
				Actions actions = (Actions)theEObject;
				T result = caseActions(actions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ACTION_OBJECT: {
				ActionObject actionObject = (ActionObject)theEObject;
				T result = caseActionObject(actionObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POU_ACTION: {
				PouAction pouAction = (PouAction)theEObject;
				T result = casePouAction(pouAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ADD_DATA: {
				AddData addData = (AddData)theEObject;
				T result = caseAddData(addData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ADD_DATA_INFO: {
				AddDataInfo addDataInfo = (AddDataInfo)theEObject;
				T result = caseAddDataInfo(addDataInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ARRAY_VALUE: {
				ArrayValue arrayValue = (ArrayValue)theEObject;
				T result = caseArrayValue(arrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.BODY: {
				Body body = (Body)theEObject;
				T result = caseBody(body);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.COIL: {
				Coil coil = (Coil)theEObject;
				T result = caseCoil(coil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONFIGURATIONS: {
				Configurations configurations = (Configurations)theEObject;
				T result = caseConfigurations(configurations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONFIG_VARIABLE: {
				ConfigVariable configVariable = (ConfigVariable)theEObject;
				T result = caseConfigVariable(configVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_IN: {
				ConnectionPointIn connectionPointIn = (ConnectionPointIn)theEObject;
				T result = caseConnectionPointIn(connectionPointIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_OUT: {
				ConnectionPointOut connectionPointOut = (ConnectionPointOut)theEObject;
				T result = caseConnectionPointOut(connectionPointOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_OUT_ACTION: {
				ConnectionPointOutAction connectionPointOutAction = (ConnectionPointOutAction)theEObject;
				T result = caseConnectionPointOutAction(connectionPointOutAction);
				if (result == null) result = caseConnectionPointOut(connectionPointOutAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.FORMAL_CONNECTION_POINT_OUT: {
				FormalConnectionPointOut formalConnectionPointOut = (FormalConnectionPointOut)theEObject;
				T result = caseFormalConnectionPointOut(formalConnectionPointOut);
				if (result == null) result = caseConnectionPointOut(formalConnectionPointOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONTACT: {
				Contact contact = (Contact)theEObject;
				T result = caseContact(contact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONTENT_HEADER: {
				ContentHeader contentHeader = (ContentHeader)theEObject;
				T result = caseContentHeader(contentHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONTINUATION: {
				Continuation continuation = (Continuation)theEObject;
				T result = caseContinuation(continuation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.COORDINATE_INFO: {
				CoordinateInfo coordinateInfo = (CoordinateInfo)theEObject;
				T result = caseCoordinateInfo(coordinateInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DATA_TYPES: {
				DataTypes dataTypes = (DataTypes)theEObject;
				T result = caseDataTypes(dataTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DATA_TYPE_TYPE: {
				DataTypeType dataTypeType = (DataTypeType)theEObject;
				T result = caseDataTypeType(dataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DERIVED: {
				Derived derived = (Derived)theEObject;
				T result = caseDerived(derived);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ENUM: {
				org.plcopen.xml.tc60201.Enum enum_ = (org.plcopen.xml.tc60201.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ERROR: {
				org.plcopen.xml.tc60201.Error error = (org.plcopen.xml.tc60201.Error)theEObject;
				T result = caseError(error);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.EXTERNAL_VARS: {
				ExternalVars externalVars = (ExternalVars)theEObject;
				T result = caseExternalVars(externalVars);
				if (result == null) result = caseVarList(externalVars);
				if (result == null) result = caseVarListPlain(externalVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.FBD_TYPE_INFO: {
				FbdTypeInfo fbdTypeInfo = (FbdTypeInfo)theEObject;
				T result = caseFbdTypeInfo(fbdTypeInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.FBD: {
				FBD fbd = (FBD)theEObject;
				T result = caseFBD(fbd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.FILE_HEADER: {
				FileHeader fileHeader = (FileHeader)theEObject;
				T result = caseFileHeader(fileHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.FORMATTED_TEXT: {
				FormattedText formattedText = (FormattedText)theEObject;
				T result = caseFormattedText(formattedText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.GLOBAL_VARS: {
				GlobalVars globalVars = (GlobalVars)theEObject;
				T result = caseGlobalVars(globalVars);
				if (result == null) result = caseVarList(globalVars);
				if (result == null) result = caseVarListPlain(globalVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INFO: {
				Info info = (Info)theEObject;
				T result = caseInfo(info);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INLINE: {
				Inline inline = (Inline)theEObject;
				T result = caseInline(inline);
				if (result == null) result = caseBody(inline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.IN_OUT_VARIABLES: {
				InOutVariables inOutVariables = (InOutVariables)theEObject;
				T result = caseInOutVariables(inOutVariables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.IN_OUT_VARIABLE: {
				InOutVariable inOutVariable = (InOutVariable)theEObject;
				T result = caseInOutVariable(inOutVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.IN_OUT_VARS: {
				InOutVars inOutVars = (InOutVars)theEObject;
				T result = caseInOutVars(inOutVars);
				if (result == null) result = caseVarList(inOutVars);
				if (result == null) result = caseVarListPlain(inOutVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INPUT_VARIABLES: {
				InputVariables inputVariables = (InputVariables)theEObject;
				T result = caseInputVariables(inputVariables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INPUT_VARS: {
				InputVars inputVars = (InputVars)theEObject;
				T result = caseInputVars(inputVars);
				if (result == null) result = caseVarList(inputVars);
				if (result == null) result = caseVarListPlain(inputVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INSTANCES: {
				Instances instances = (Instances)theEObject;
				T result = caseInstances(instances);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.IN_VARIABLE: {
				InVariable inVariable = (InVariable)theEObject;
				T result = caseInVariable(inVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.JUMP_STEP: {
				JumpStep jumpStep = (JumpStep)theEObject;
				T result = caseJumpStep(jumpStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.JUMP: {
				Jump jump = (Jump)theEObject;
				T result = caseJump(jump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LD_TYPE_INFO: {
				LdTypeInfo ldTypeInfo = (LdTypeInfo)theEObject;
				T result = caseLdTypeInfo(ldTypeInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LD: {
				LD ld = (LD)theEObject;
				T result = caseLD(ld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LEFT_POWER_RAIL: {
				LeftPowerRail leftPowerRail = (LeftPowerRail)theEObject;
				T result = caseLeftPowerRail(leftPowerRail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LOCAL_VARS: {
				LocalVars localVars = (LocalVars)theEObject;
				T result = caseLocalVars(localVars);
				if (result == null) result = caseVarList(localVars);
				if (result == null) result = caseVarListPlain(localVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.MACRO_STEP: {
				MacroStep macroStep = (MacroStep)theEObject;
				T result = caseMacroStep(macroStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.OUTPUT_VARIABLES: {
				OutputVariables outputVariables = (OutputVariables)theEObject;
				T result = caseOutputVariables(outputVariables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.OUTPUT_VARS: {
				OutputVars outputVars = (OutputVars)theEObject;
				T result = caseOutputVars(outputVars);
				if (result == null) result = caseVarList(outputVars);
				if (result == null) result = caseVarListPlain(outputVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.OUT_VARIABLE: {
				OutVariable outVariable = (OutVariable)theEObject;
				T result = caseOutVariable(outVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.PAGE_SIZE: {
				PageSize pageSize = (PageSize)theEObject;
				T result = casePageSize(pageSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POINTER: {
				Pointer pointer = (Pointer)theEObject;
				T result = casePointer(pointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POU_INSTANCE: {
				PouInstance pouInstance = (PouInstance)theEObject;
				T result = casePouInstance(pouInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POUS: {
				Pous pous = (Pous)theEObject;
				T result = casePous(pous);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POU: {
				Pou pou = (Pou)theEObject;
				T result = casePou(pou);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RANGE_SIGNED: {
				RangeSigned rangeSigned = (RangeSigned)theEObject;
				T result = caseRangeSigned(rangeSigned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RANGE_UNSIGNED: {
				RangeUnsigned rangeUnsigned = (RangeUnsigned)theEObject;
				T result = caseRangeUnsigned(rangeUnsigned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RETURN_TYPE: {
				ReturnType returnType = (ReturnType)theEObject;
				T result = caseReturnType(returnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RIGHT_POWER_RAIL: {
				RightPowerRail rightPowerRail = (RightPowerRail)theEObject;
				T result = caseRightPowerRail(rightPowerRail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SCALING: {
				Scaling scaling = (Scaling)theEObject;
				T result = caseScaling(scaling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SELECTION_CONVERGENCE: {
				SelectionConvergence selectionConvergence = (SelectionConvergence)theEObject;
				T result = caseSelectionConvergence(selectionConvergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SELECTION_DIVERGENCE_TYPE: {
				SelectionDivergenceType selectionDivergenceType = (SelectionDivergenceType)theEObject;
				T result = caseSelectionDivergenceType(selectionDivergenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SFC_TYPE_INFO: {
				SfcTypeInfo sfcTypeInfo = (SfcTypeInfo)theEObject;
				T result = caseSfcTypeInfo(sfcTypeInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SFC: {
				SFC sfc = (SFC)theEObject;
				T result = caseSFC(sfc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SIMPLE_VALUE: {
				SimpleValue simpleValue = (SimpleValue)theEObject;
				T result = caseSimpleValue(simpleValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VERGENCE: {
				Vergence vergence = (Vergence)theEObject;
				T result = caseVergence(vergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SIMULTANEOUS_CONVERGENCE: {
				SimultaneousConvergence simultaneousConvergence = (SimultaneousConvergence)theEObject;
				T result = caseSimultaneousConvergence(simultaneousConvergence);
				if (result == null) result = caseVergence(simultaneousConvergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE: {
				SimultaneousDivergence simultaneousDivergence = (SimultaneousDivergence)theEObject;
				T result = caseSimultaneousDivergence(simultaneousDivergence);
				if (result == null) result = caseVergence(simultaneousDivergence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.STRUCT_VALUE: {
				StructValue structValue = (StructValue)theEObject;
				T result = caseStructValue(structValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SUBRANGE_SIGNED: {
				SubrangeSigned subrangeSigned = (SubrangeSigned)theEObject;
				T result = caseSubrangeSigned(subrangeSigned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SUBRANGE_UNSIGNED: {
				SubrangeUnsigned subrangeUnsigned = (SubrangeUnsigned)theEObject;
				T result = caseSubrangeUnsigned(subrangeUnsigned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.TASK_TYPE: {
				TaskType taskType = (TaskType)theEObject;
				T result = caseTaskType(taskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.TEMP_VARS: {
				TempVars tempVars = (TempVars)theEObject;
				T result = caseTempVars(tempVars);
				if (result == null) result = caseVarList(tempVars);
				if (result == null) result = caseVarListPlain(tempVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SFC_TRANSITIONS: {
				SfcTransitions sfcTransitions = (SfcTransitions)theEObject;
				T result = caseSfcTransitions(sfcTransitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SFC_TRANSITION: {
				SfcTransition sfcTransition = (SfcTransition)theEObject;
				T result = caseSfcTransition(sfcTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POU_TRANSITION: {
				PouTransition pouTransition = (PouTransition)theEObject;
				T result = casePouTransition(pouTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.TYPES: {
				Types types = (Types)theEObject;
				T result = caseTypes(types);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VALUES: {
				Values values = (Values)theEObject;
				T result = caseValues(values);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.MEMBER_VALUE: {
				MemberValue memberValue = (MemberValue)theEObject;
				T result = caseMemberValue(memberValue);
				if (result == null) result = caseValue(memberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.REPITITION_VALUE: {
				RepititionValue repititionValue = (RepititionValue)theEObject;
				T result = caseRepititionValue(repititionValue);
				if (result == null) result = caseValue(repititionValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ENUMERATION_VALUE: {
				EnumerationValue enumerationValue = (EnumerationValue)theEObject;
				T result = caseEnumerationValue(enumerationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INPUT_VARIABLE: {
				InputVariable inputVariable = (InputVariable)theEObject;
				T result = caseInputVariable(inputVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.OUTPUT_VARIABLE: {
				OutputVariable outputVariable = (OutputVariable)theEObject;
				T result = caseOutputVariable(outputVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INPUT_OUTPUT_VARIABLE: {
				InputOutputVariable inputOutputVariable = (InputOutputVariable)theEObject;
				T result = caseInputOutputVariable(inputOutputVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VARIABLE_TYPE6: {
				VariableType6 variableType6 = (VariableType6)theEObject;
				T result = caseVariableType6(variableType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VAR_LIST: {
				VarList varList = (VarList)theEObject;
				T result = caseVarList(varList);
				if (result == null) result = caseVarListPlain(varList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VAR_LIST_ACCESS: {
				VarListAccess varListAccess = (VarListAccess)theEObject;
				T result = caseVarListAccess(varListAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VAR_LIST_CONFIG: {
				VarListConfig varListConfig = (VarListConfig)theEObject;
				T result = caseVarListConfig(varListConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VAR_LIST_PLAIN: {
				VarListPlain varListPlain = (VarListPlain)theEObject;
				T result = caseVarListPlain(varListPlain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VENDOR_ELEMENT: {
				VendorElement vendorElement = (VendorElement)theEObject;
				T result = caseVendorElement(vendorElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.WSTRING: {
				Wstring wstring = (Wstring)theEObject;
				T result = caseWstring(wstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessVariable(AccessVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionBlock(ActionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActions(Actions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionObject(ActionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pou Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pou Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePouAction(PouAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddData(AddData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Data Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Data Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddDataInfo(AddDataInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayValue(ArrayValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBody(Body object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoil(Coil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurations(Configurations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigVariable(ConfigVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointIn(ConnectionPointIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointOut(ConnectionPointOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Out Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Out Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointOutAction(ConnectionPointOutAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Connection Point Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Connection Point Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalConnectionPointOut(FormalConnectionPointOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContact(Contact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentHeader(ContentHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuation(Continuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateInfo(CoordinateInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypes(DataTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeType(DataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerived(Derived object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(org.plcopen.xml.tc60201.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseError(org.plcopen.xml.tc60201.Error object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalVars(ExternalVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fbd Type Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fbd Type Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFbdTypeInfo(FbdTypeInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FBD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FBD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBD(FBD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileHeader(FileHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formatted Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formatted Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormattedText(FormattedText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVars(GlobalVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfo(Info object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInline(Inline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Out Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Out Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInOutVariables(InOutVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Out Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Out Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInOutVariable(InOutVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Out Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Out Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInOutVars(InOutVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVariables(InputVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVars(InputVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instances</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instances</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstances(Instances object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInVariable(InVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpStep(JumpStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJump(Jump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ld Type Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ld Type Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLdTypeInfo(LdTypeInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLD(LD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Power Rail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Power Rail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftPowerRail(LeftPowerRail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVars(LocalVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroStep(MacroStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVariables(OutputVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVars(OutputVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutVariable(OutVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageSize(PageSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointer(Pointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pou Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pou Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePouInstance(PouInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePous(Pous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pou</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pou</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePou(Pou object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Signed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Signed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeSigned(RangeSigned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Unsigned</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Unsigned</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeUnsigned(RangeUnsigned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Power Rail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Power Rail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightPowerRail(RightPowerRail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaling(Scaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Convergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionConvergence(SelectionConvergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Divergence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Divergence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionDivergenceType(SelectionDivergenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sfc Type Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sfc Type Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSfcTypeInfo(SfcTypeInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFC(SFC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleValue(SimpleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVergence(Vergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simultaneous Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simultaneous Convergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimultaneousConvergence(SimultaneousConvergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simultaneous Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simultaneous Divergence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimultaneousDivergence(SimultaneousDivergence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructValue(StructValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Signed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Signed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeSigned(SubrangeSigned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Unsigned</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Unsigned</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeUnsigned(SubrangeUnsigned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temp Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temp Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTempVars(TempVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sfc Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sfc Transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSfcTransitions(SfcTransitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sfc Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sfc Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSfcTransition(SfcTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pou Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pou Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePouTransition(PouTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypes(Types object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValues(Values object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberValue(MemberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repitition Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repitition Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepititionValue(RepititionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationValue(EnumerationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVariable(InputVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVariable(OutputVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Output Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Output Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputOutputVariable(InputOutputVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType6(VariableType6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarList(VarList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarListAccess(VarListAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarListConfig(VarListConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List Plain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List Plain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarListPlain(VarListPlain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendorElement(VendorElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wstring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wstring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWstring(Wstring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Tc60201Switch
