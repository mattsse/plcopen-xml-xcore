/**
 */
package org.plcopen.xml.tc60201.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.plcopen.xml.tc60201.AccessType;
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
import org.plcopen.xml.tc60201.EdgeModifierType;
import org.plcopen.xml.tc60201.EnumerationValue;
import org.plcopen.xml.tc60201.ExternalVars;
import org.plcopen.xml.tc60201.FBD;
import org.plcopen.xml.tc60201.FbdTypeInfo;
import org.plcopen.xml.tc60201.FileHeader;
import org.plcopen.xml.tc60201.FormalConnectionPointOut;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.GlobalVars;
import org.plcopen.xml.tc60201.HandleUnknownType;
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
import org.plcopen.xml.tc60201.PouType;
import org.plcopen.xml.tc60201.Pous;
import org.plcopen.xml.tc60201.Project;
import org.plcopen.xml.tc60201.Qualifier;
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
import org.plcopen.xml.tc60201.StorageModifierType;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.plcopen.xml.tc60201.Tc60201Package
 * @generated
 */
public class Tc60201Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Tc60201Validator INSTANCE = new Tc60201Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.plcopen.xml.tc60201";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tc60201Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Tc60201Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Tc60201Package.ACCESS_VARIABLE:
				return validateAccessVariable((AccessVariable)value, diagnostics, context);
			case Tc60201Package.ACTION_BLOCK:
				return validateActionBlock((ActionBlock)value, diagnostics, context);
			case Tc60201Package.ACTIONS:
				return validateActions((Actions)value, diagnostics, context);
			case Tc60201Package.ACTION_OBJECT:
				return validateActionObject((ActionObject)value, diagnostics, context);
			case Tc60201Package.POU_ACTION:
				return validatePouAction((PouAction)value, diagnostics, context);
			case Tc60201Package.ADD_DATA:
				return validateAddData((AddData)value, diagnostics, context);
			case Tc60201Package.ADD_DATA_INFO:
				return validateAddDataInfo((AddDataInfo)value, diagnostics, context);
			case Tc60201Package.ARRAY:
				return validateArray((Array)value, diagnostics, context);
			case Tc60201Package.ARRAY_VALUE:
				return validateArrayValue((ArrayValue)value, diagnostics, context);
			case Tc60201Package.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case Tc60201Package.BODY:
				return validateBody((Body)value, diagnostics, context);
			case Tc60201Package.COIL:
				return validateCoil((Coil)value, diagnostics, context);
			case Tc60201Package.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case Tc60201Package.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case Tc60201Package.CONFIGURATIONS:
				return validateConfigurations((Configurations)value, diagnostics, context);
			case Tc60201Package.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case Tc60201Package.CONFIG_VARIABLE:
				return validateConfigVariable((ConfigVariable)value, diagnostics, context);
			case Tc60201Package.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_IN:
				return validateConnectionPointIn((ConnectionPointIn)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_OUT:
				return validateConnectionPointOut((ConnectionPointOut)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_OUT_ACTION:
				return validateConnectionPointOutAction((ConnectionPointOutAction)value, diagnostics, context);
			case Tc60201Package.FORMAL_CONNECTION_POINT_OUT:
				return validateFormalConnectionPointOut((FormalConnectionPointOut)value, diagnostics, context);
			case Tc60201Package.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case Tc60201Package.CONTACT:
				return validateContact((Contact)value, diagnostics, context);
			case Tc60201Package.CONTENT_HEADER:
				return validateContentHeader((ContentHeader)value, diagnostics, context);
			case Tc60201Package.CONTINUATION:
				return validateContinuation((Continuation)value, diagnostics, context);
			case Tc60201Package.COORDINATE_INFO:
				return validateCoordinateInfo((CoordinateInfo)value, diagnostics, context);
			case Tc60201Package.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case Tc60201Package.DATA:
				return validateData((Data)value, diagnostics, context);
			case Tc60201Package.DATA_TYPES:
				return validateDataTypes((DataTypes)value, diagnostics, context);
			case Tc60201Package.DATA_TYPE_TYPE:
				return validateDataTypeType((DataTypeType)value, diagnostics, context);
			case Tc60201Package.DERIVED:
				return validateDerived((Derived)value, diagnostics, context);
			case Tc60201Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Tc60201Package.ENUM:
				return validateEnum((org.plcopen.xml.tc60201.Enum)value, diagnostics, context);
			case Tc60201Package.ERROR:
				return validateError((org.plcopen.xml.tc60201.Error)value, diagnostics, context);
			case Tc60201Package.EXTERNAL_VARS:
				return validateExternalVars((ExternalVars)value, diagnostics, context);
			case Tc60201Package.FBD_TYPE_INFO:
				return validateFbdTypeInfo((FbdTypeInfo)value, diagnostics, context);
			case Tc60201Package.FBD:
				return validateFBD((FBD)value, diagnostics, context);
			case Tc60201Package.FILE_HEADER:
				return validateFileHeader((FileHeader)value, diagnostics, context);
			case Tc60201Package.FORMATTED_TEXT:
				return validateFormattedText((FormattedText)value, diagnostics, context);
			case Tc60201Package.GLOBAL_VARS:
				return validateGlobalVars((GlobalVars)value, diagnostics, context);
			case Tc60201Package.INFO:
				return validateInfo((Info)value, diagnostics, context);
			case Tc60201Package.INLINE:
				return validateInline((Inline)value, diagnostics, context);
			case Tc60201Package.IN_OUT_VARIABLES:
				return validateInOutVariables((InOutVariables)value, diagnostics, context);
			case Tc60201Package.IN_OUT_VARIABLE:
				return validateInOutVariable((InOutVariable)value, diagnostics, context);
			case Tc60201Package.IN_OUT_VARS:
				return validateInOutVars((InOutVars)value, diagnostics, context);
			case Tc60201Package.INPUT_VARIABLES:
				return validateInputVariables((InputVariables)value, diagnostics, context);
			case Tc60201Package.INPUT_VARS:
				return validateInputVars((InputVars)value, diagnostics, context);
			case Tc60201Package.INSTANCES:
				return validateInstances((Instances)value, diagnostics, context);
			case Tc60201Package.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case Tc60201Package.IN_VARIABLE:
				return validateInVariable((InVariable)value, diagnostics, context);
			case Tc60201Package.JUMP_STEP:
				return validateJumpStep((JumpStep)value, diagnostics, context);
			case Tc60201Package.JUMP:
				return validateJump((Jump)value, diagnostics, context);
			case Tc60201Package.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case Tc60201Package.LD_TYPE_INFO:
				return validateLdTypeInfo((LdTypeInfo)value, diagnostics, context);
			case Tc60201Package.LD:
				return validateLD((LD)value, diagnostics, context);
			case Tc60201Package.LEFT_POWER_RAIL:
				return validateLeftPowerRail((LeftPowerRail)value, diagnostics, context);
			case Tc60201Package.LOCAL_VARS:
				return validateLocalVars((LocalVars)value, diagnostics, context);
			case Tc60201Package.MACRO_STEP:
				return validateMacroStep((MacroStep)value, diagnostics, context);
			case Tc60201Package.OUTPUT_VARIABLES:
				return validateOutputVariables((OutputVariables)value, diagnostics, context);
			case Tc60201Package.OUTPUT_VARS:
				return validateOutputVars((OutputVars)value, diagnostics, context);
			case Tc60201Package.OUT_VARIABLE:
				return validateOutVariable((OutVariable)value, diagnostics, context);
			case Tc60201Package.PAGE_SIZE:
				return validatePageSize((PageSize)value, diagnostics, context);
			case Tc60201Package.POINTER:
				return validatePointer((Pointer)value, diagnostics, context);
			case Tc60201Package.POSITION:
				return validatePosition((Position)value, diagnostics, context);
			case Tc60201Package.POU_INSTANCE:
				return validatePouInstance((PouInstance)value, diagnostics, context);
			case Tc60201Package.POUS:
				return validatePous((Pous)value, diagnostics, context);
			case Tc60201Package.POU:
				return validatePou((Pou)value, diagnostics, context);
			case Tc60201Package.PROJECT:
				return validateProject((Project)value, diagnostics, context);
			case Tc60201Package.RANGE_SIGNED:
				return validateRangeSigned((RangeSigned)value, diagnostics, context);
			case Tc60201Package.RANGE_UNSIGNED:
				return validateRangeUnsigned((RangeUnsigned)value, diagnostics, context);
			case Tc60201Package.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case Tc60201Package.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case Tc60201Package.RETURN_TYPE:
				return validateReturnType((ReturnType)value, diagnostics, context);
			case Tc60201Package.RIGHT_POWER_RAIL:
				return validateRightPowerRail((RightPowerRail)value, diagnostics, context);
			case Tc60201Package.SCALING:
				return validateScaling((Scaling)value, diagnostics, context);
			case Tc60201Package.SELECTION_CONVERGENCE:
				return validateSelectionConvergence((SelectionConvergence)value, diagnostics, context);
			case Tc60201Package.SELECTION_DIVERGENCE_TYPE:
				return validateSelectionDivergenceType((SelectionDivergenceType)value, diagnostics, context);
			case Tc60201Package.SFC_TYPE_INFO:
				return validateSfcTypeInfo((SfcTypeInfo)value, diagnostics, context);
			case Tc60201Package.SFC:
				return validateSFC((SFC)value, diagnostics, context);
			case Tc60201Package.SIMPLE_VALUE:
				return validateSimpleValue((SimpleValue)value, diagnostics, context);
			case Tc60201Package.VERGENCE:
				return validateVergence((Vergence)value, diagnostics, context);
			case Tc60201Package.SIMULTANEOUS_CONVERGENCE:
				return validateSimultaneousConvergence((SimultaneousConvergence)value, diagnostics, context);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE:
				return validateSimultaneousDivergence((SimultaneousDivergence)value, diagnostics, context);
			case Tc60201Package.STEP:
				return validateStep((Step)value, diagnostics, context);
			case Tc60201Package.STRING_TYPE:
				return validateStringType((StringType)value, diagnostics, context);
			case Tc60201Package.STRUCT_VALUE:
				return validateStructValue((StructValue)value, diagnostics, context);
			case Tc60201Package.SUBRANGE_SIGNED:
				return validateSubrangeSigned((SubrangeSigned)value, diagnostics, context);
			case Tc60201Package.SUBRANGE_UNSIGNED:
				return validateSubrangeUnsigned((SubrangeUnsigned)value, diagnostics, context);
			case Tc60201Package.TASK_TYPE:
				return validateTaskType((TaskType)value, diagnostics, context);
			case Tc60201Package.TEMP_VARS:
				return validateTempVars((TempVars)value, diagnostics, context);
			case Tc60201Package.SFC_TRANSITIONS:
				return validateSfcTransitions((SfcTransitions)value, diagnostics, context);
			case Tc60201Package.SFC_TRANSITION:
				return validateSfcTransition((SfcTransition)value, diagnostics, context);
			case Tc60201Package.POU_TRANSITION:
				return validatePouTransition((PouTransition)value, diagnostics, context);
			case Tc60201Package.TYPES:
				return validateTypes((Types)value, diagnostics, context);
			case Tc60201Package.VALUE:
				return validateValue((Value)value, diagnostics, context);
			case Tc60201Package.VALUES:
				return validateValues((Values)value, diagnostics, context);
			case Tc60201Package.MEMBER_VALUE:
				return validateMemberValue((MemberValue)value, diagnostics, context);
			case Tc60201Package.REPITITION_VALUE:
				return validateRepititionValue((RepititionValue)value, diagnostics, context);
			case Tc60201Package.ENUMERATION_VALUE:
				return validateEnumerationValue((EnumerationValue)value, diagnostics, context);
			case Tc60201Package.INPUT_VARIABLE:
				return validateInputVariable((InputVariable)value, diagnostics, context);
			case Tc60201Package.OUTPUT_VARIABLE:
				return validateOutputVariable((OutputVariable)value, diagnostics, context);
			case Tc60201Package.INPUT_OUTPUT_VARIABLE:
				return validateInputOutputVariable((InputOutputVariable)value, diagnostics, context);
			case Tc60201Package.VARIABLE_TYPE6:
				return validateVariableType6((VariableType6)value, diagnostics, context);
			case Tc60201Package.VAR_LIST:
				return validateVarList((VarList)value, diagnostics, context);
			case Tc60201Package.VAR_LIST_ACCESS:
				return validateVarListAccess((VarListAccess)value, diagnostics, context);
			case Tc60201Package.VAR_LIST_CONFIG:
				return validateVarListConfig((VarListConfig)value, diagnostics, context);
			case Tc60201Package.VAR_LIST_PLAIN:
				return validateVarListPlain((VarListPlain)value, diagnostics, context);
			case Tc60201Package.VENDOR_ELEMENT:
				return validateVendorElement((VendorElement)value, diagnostics, context);
			case Tc60201Package.WSTRING:
				return validateWstring((Wstring)value, diagnostics, context);
			case Tc60201Package.ACCESS_TYPE:
				return validateAccessType((AccessType)value, diagnostics, context);
			case Tc60201Package.EDGE_MODIFIER_TYPE:
				return validateEdgeModifierType((EdgeModifierType)value, diagnostics, context);
			case Tc60201Package.HANDLE_UNKNOWN_TYPE:
				return validateHandleUnknownType((HandleUnknownType)value, diagnostics, context);
			case Tc60201Package.POU_TYPE:
				return validatePouType((PouType)value, diagnostics, context);
			case Tc60201Package.QUALIFIER:
				return validateQualifier((Qualifier)value, diagnostics, context);
			case Tc60201Package.STORAGE_MODIFIER_TYPE:
				return validateStorageModifierType((StorageModifierType)value, diagnostics, context);
			case Tc60201Package.ACCESS_TYPE_OBJECT:
				return validateAccessTypeObject((AccessType)value, diagnostics, context);
			case Tc60201Package.EDGE_MODIFIER_TYPE_OBJECT:
				return validateEdgeModifierTypeObject((EdgeModifierType)value, diagnostics, context);
			case Tc60201Package.HANDLE_UNKNOWN_TYPE_OBJECT:
				return validateHandleUnknownTypeObject((HandleUnknownType)value, diagnostics, context);
			case Tc60201Package.POU_TYPE_OBJECT:
				return validatePouTypeObject((PouType)value, diagnostics, context);
			case Tc60201Package.PRIORITY:
				return validatePriority((BigInteger)value, diagnostics, context);
			case Tc60201Package.QUALIFIER_TYPE_OBJECT:
				return validateQualifierTypeObject((Qualifier)value, diagnostics, context);
			case Tc60201Package.STORAGE_MODIFIER_TYPE_OBJECT:
				return validateStorageModifierTypeObject((StorageModifierType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessVariable(AccessVariable accessVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionBlock(ActionBlock actionBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActions(Actions actions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionObject(ActionObject actionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouAction(PouAction pouAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pouAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddData(AddData addData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddDataInfo(AddDataInfo addDataInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addDataInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArray(Array array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(array, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayValue(ArrayValue arrayValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBody(Body body, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(body, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoil(Coil coil, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coil, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurations(Configurations configurations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configuration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigVariable(ConfigVariable configVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointIn(ConnectionPointIn connectionPointIn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointIn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointOut(ConnectionPointOut connectionPointOut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointOut, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointOutAction(ConnectionPointOutAction connectionPointOutAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointOutAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalConnectionPointOut(FormalConnectionPointOut formalConnectionPointOut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formalConnectionPointOut, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentHeader(ContentHeader contentHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation(Continuation continuation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinateInfo(CoordinateInfo coordinateInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinateInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypes(DataTypes dataTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeType(DataTypeType dataTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerived(Derived derived, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derived, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnum(org.plcopen.xml.tc60201.Enum enum_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enum_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateError(org.plcopen.xml.tc60201.Error error, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(error, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalVars(ExternalVars externalVars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalVars, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFbdTypeInfo(FbdTypeInfo fbdTypeInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fbdTypeInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFBD(FBD fbd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fbd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileHeader(FileHeader fileHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormattedText(FormattedText formattedText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formattedText, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalVars(GlobalVars globalVars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalVars, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(info, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInline(Inline inline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInOutVariables(InOutVariables inOutVariables, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inOutVariables, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInOutVariable(InOutVariable inOutVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inOutVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInOutVars(InOutVars inOutVars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inOutVars, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputVariables(InputVariables inputVariables, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputVariables, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputVars(InputVars inputVars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputVars, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstances(Instances instances, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instances, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInVariable(InVariable inVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJumpStep(JumpStep jumpStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jumpStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJump(Jump jump, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jump, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(label, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLdTypeInfo(LdTypeInfo ldTypeInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ldTypeInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLD(LD ld, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ld, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeftPowerRail(LeftPowerRail leftPowerRail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leftPowerRail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalVars(LocalVars localVars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localVars, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacroStep(MacroStep macroStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(macroStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputVariables(OutputVariables outputVariables, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputVariables, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputVars(OutputVars outputVars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputVars, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutVariable(OutVariable outVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageSize(PageSize pageSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageSize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointer(Pointer pointer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouInstance(PouInstance pouInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pouInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePous(Pous pous, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pous, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePou(Pou pou, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pou, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(project, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeSigned(RangeSigned rangeSigned, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeSigned, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUnsigned(RangeUnsigned rangeUnsigned, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeUnsigned, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnType(ReturnType returnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRightPowerRail(RightPowerRail rightPowerRail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rightPowerRail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaling(Scaling scaling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaling, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionConvergence(SelectionConvergence selectionConvergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectionConvergence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionDivergenceType(SelectionDivergenceType selectionDivergenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectionDivergenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSfcTypeInfo(SfcTypeInfo sfcTypeInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sfcTypeInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSFC(SFC sfc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sfc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleValue(SimpleValue simpleValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVergence(Vergence vergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vergence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimultaneousConvergence(SimultaneousConvergence simultaneousConvergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simultaneousConvergence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimultaneousDivergence(SimultaneousDivergence simultaneousDivergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simultaneousDivergence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructValue(StructValue structValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubrangeSigned(SubrangeSigned subrangeSigned, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subrangeSigned, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubrangeUnsigned(SubrangeUnsigned subrangeUnsigned, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subrangeUnsigned, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskType(TaskType taskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTempVars(TempVars tempVars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tempVars, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSfcTransitions(SfcTransitions sfcTransitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sfcTransitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSfcTransition(SfcTransition sfcTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sfcTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouTransition(PouTransition pouTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pouTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypes(Types types, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(types, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(value, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValues(Values values, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(values, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberValue(MemberValue memberValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memberValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepititionValue(RepititionValue repititionValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repititionValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationValue(EnumerationValue enumerationValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputVariable(InputVariable inputVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputVariable(OutputVariable outputVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputOutputVariable(InputOutputVariable inputOutputVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputOutputVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType6(VariableType6 variableType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarList(VarList varList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarListAccess(VarListAccess varListAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varListAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarListConfig(VarListConfig varListConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varListConfig, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarListPlain(VarListPlain varListPlain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varListPlain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVendorElement(VendorElement vendorElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vendorElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWstring(Wstring wstring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wstring, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType(AccessType accessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeModifierType(EdgeModifierType edgeModifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandleUnknownType(HandleUnknownType handleUnknownType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouType(PouType pouType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifier(Qualifier qualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageModifierType(StorageModifierType storageModifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeObject(AccessType accessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeModifierTypeObject(EdgeModifierType edgeModifierTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandleUnknownTypeObject(HandleUnknownType handleUnknownTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouTypeObject(PouType pouTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriority(BigInteger priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePriority_Min(priority, diagnostics, context);
		if (result || diagnostics != null) result &= validatePriority_Max(priority, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePriority_Min
	 */
	public static final BigInteger PRIORITY__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriority_Min(BigInteger priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = priority.compareTo(PRIORITY__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Tc60201Package.eINSTANCE.getPriority(), priority, PRIORITY__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePriority_Max
	 */
	public static final BigInteger PRIORITY__MAX__VALUE = new BigInteger("65535");

	/**
	 * Validates the Max constraint of '<em>Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriority_Max(BigInteger priority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = priority.compareTo(PRIORITY__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Tc60201Package.eINSTANCE.getPriority(), priority, PRIORITY__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierTypeObject(Qualifier qualifierTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageModifierTypeObject(StorageModifierType storageModifierTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Tc60201Validator
