/**
 */
package org.plcopen.xml.tc60201.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.plcopen.xml.tc60201.Tc60201Package
 * @generated
 */
public class Tc60201AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tc60201Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tc60201AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Tc60201Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tc60201Switch<Adapter> modelSwitch =
		new Tc60201Switch<Adapter>() {
			@Override
			public Adapter caseAccessVariable(AccessVariable object) {
				return createAccessVariableAdapter();
			}
			@Override
			public Adapter caseActionBlock(ActionBlock object) {
				return createActionBlockAdapter();
			}
			@Override
			public Adapter caseActions(Actions object) {
				return createActionsAdapter();
			}
			@Override
			public Adapter caseActionObject(ActionObject object) {
				return createActionObjectAdapter();
			}
			@Override
			public Adapter casePouAction(PouAction object) {
				return createPouActionAdapter();
			}
			@Override
			public Adapter caseAddData(AddData object) {
				return createAddDataAdapter();
			}
			@Override
			public Adapter caseAddDataInfo(AddDataInfo object) {
				return createAddDataInfoAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseArrayValue(ArrayValue object) {
				return createArrayValueAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseBody(Body object) {
				return createBodyAdapter();
			}
			@Override
			public Adapter caseCoil(Coil object) {
				return createCoilAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConfigurations(Configurations object) {
				return createConfigurationsAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseConfigVariable(ConfigVariable object) {
				return createConfigVariableAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseConnectionPointIn(ConnectionPointIn object) {
				return createConnectionPointInAdapter();
			}
			@Override
			public Adapter caseConnectionPointOut(ConnectionPointOut object) {
				return createConnectionPointOutAdapter();
			}
			@Override
			public Adapter caseConnectionPointOutAction(ConnectionPointOutAction object) {
				return createConnectionPointOutActionAdapter();
			}
			@Override
			public Adapter caseFormalConnectionPointOut(FormalConnectionPointOut object) {
				return createFormalConnectionPointOutAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseContact(Contact object) {
				return createContactAdapter();
			}
			@Override
			public Adapter caseContentHeader(ContentHeader object) {
				return createContentHeaderAdapter();
			}
			@Override
			public Adapter caseContinuation(Continuation object) {
				return createContinuationAdapter();
			}
			@Override
			public Adapter caseCoordinateInfo(CoordinateInfo object) {
				return createCoordinateInfoAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseDataTypes(DataTypes object) {
				return createDataTypesAdapter();
			}
			@Override
			public Adapter caseDataTypeType(DataTypeType object) {
				return createDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseDerived(Derived object) {
				return createDerivedAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnum(org.plcopen.xml.tc60201.Enum object) {
				return createEnumAdapter();
			}
			@Override
			public Adapter caseError(org.plcopen.xml.tc60201.Error object) {
				return createErrorAdapter();
			}
			@Override
			public Adapter caseExternalVars(ExternalVars object) {
				return createExternalVarsAdapter();
			}
			@Override
			public Adapter caseFbdTypeInfo(FbdTypeInfo object) {
				return createFbdTypeInfoAdapter();
			}
			@Override
			public Adapter caseFBD(FBD object) {
				return createFBDAdapter();
			}
			@Override
			public Adapter caseFileHeader(FileHeader object) {
				return createFileHeaderAdapter();
			}
			@Override
			public Adapter caseFormattedText(FormattedText object) {
				return createFormattedTextAdapter();
			}
			@Override
			public Adapter caseGlobalVars(GlobalVars object) {
				return createGlobalVarsAdapter();
			}
			@Override
			public Adapter caseInfo(Info object) {
				return createInfoAdapter();
			}
			@Override
			public Adapter caseInline(Inline object) {
				return createInlineAdapter();
			}
			@Override
			public Adapter caseInOutVariables(InOutVariables object) {
				return createInOutVariablesAdapter();
			}
			@Override
			public Adapter caseInOutVariable(InOutVariable object) {
				return createInOutVariableAdapter();
			}
			@Override
			public Adapter caseInOutVars(InOutVars object) {
				return createInOutVarsAdapter();
			}
			@Override
			public Adapter caseInputVariables(InputVariables object) {
				return createInputVariablesAdapter();
			}
			@Override
			public Adapter caseInputVars(InputVars object) {
				return createInputVarsAdapter();
			}
			@Override
			public Adapter caseInstances(Instances object) {
				return createInstancesAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInVariable(InVariable object) {
				return createInVariableAdapter();
			}
			@Override
			public Adapter caseJumpStep(JumpStep object) {
				return createJumpStepAdapter();
			}
			@Override
			public Adapter caseJump(Jump object) {
				return createJumpAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseLdTypeInfo(LdTypeInfo object) {
				return createLdTypeInfoAdapter();
			}
			@Override
			public Adapter caseLD(LD object) {
				return createLDAdapter();
			}
			@Override
			public Adapter caseLeftPowerRail(LeftPowerRail object) {
				return createLeftPowerRailAdapter();
			}
			@Override
			public Adapter caseLocalVars(LocalVars object) {
				return createLocalVarsAdapter();
			}
			@Override
			public Adapter caseMacroStep(MacroStep object) {
				return createMacroStepAdapter();
			}
			@Override
			public Adapter caseOutputVariables(OutputVariables object) {
				return createOutputVariablesAdapter();
			}
			@Override
			public Adapter caseOutputVars(OutputVars object) {
				return createOutputVarsAdapter();
			}
			@Override
			public Adapter caseOutVariable(OutVariable object) {
				return createOutVariableAdapter();
			}
			@Override
			public Adapter casePageSize(PageSize object) {
				return createPageSizeAdapter();
			}
			@Override
			public Adapter casePointer(Pointer object) {
				return createPointerAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter casePouInstance(PouInstance object) {
				return createPouInstanceAdapter();
			}
			@Override
			public Adapter casePous(Pous object) {
				return createPousAdapter();
			}
			@Override
			public Adapter casePou(Pou object) {
				return createPouAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseRangeSigned(RangeSigned object) {
				return createRangeSignedAdapter();
			}
			@Override
			public Adapter caseRangeUnsigned(RangeUnsigned object) {
				return createRangeUnsignedAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseReturnType(ReturnType object) {
				return createReturnTypeAdapter();
			}
			@Override
			public Adapter caseRightPowerRail(RightPowerRail object) {
				return createRightPowerRailAdapter();
			}
			@Override
			public Adapter caseScaling(Scaling object) {
				return createScalingAdapter();
			}
			@Override
			public Adapter caseSelectionConvergence(SelectionConvergence object) {
				return createSelectionConvergenceAdapter();
			}
			@Override
			public Adapter caseSelectionDivergenceType(SelectionDivergenceType object) {
				return createSelectionDivergenceTypeAdapter();
			}
			@Override
			public Adapter caseSfcTypeInfo(SfcTypeInfo object) {
				return createSfcTypeInfoAdapter();
			}
			@Override
			public Adapter caseSFC(SFC object) {
				return createSFCAdapter();
			}
			@Override
			public Adapter caseSimpleValue(SimpleValue object) {
				return createSimpleValueAdapter();
			}
			@Override
			public Adapter caseVergence(Vergence object) {
				return createVergenceAdapter();
			}
			@Override
			public Adapter caseSimultaneousConvergence(SimultaneousConvergence object) {
				return createSimultaneousConvergenceAdapter();
			}
			@Override
			public Adapter caseSimultaneousDivergence(SimultaneousDivergence object) {
				return createSimultaneousDivergenceAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseStructValue(StructValue object) {
				return createStructValueAdapter();
			}
			@Override
			public Adapter caseSubrangeSigned(SubrangeSigned object) {
				return createSubrangeSignedAdapter();
			}
			@Override
			public Adapter caseSubrangeUnsigned(SubrangeUnsigned object) {
				return createSubrangeUnsignedAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object) {
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter caseTempVars(TempVars object) {
				return createTempVarsAdapter();
			}
			@Override
			public Adapter caseSfcTransitions(SfcTransitions object) {
				return createSfcTransitionsAdapter();
			}
			@Override
			public Adapter caseSfcTransition(SfcTransition object) {
				return createSfcTransitionAdapter();
			}
			@Override
			public Adapter casePouTransition(PouTransition object) {
				return createPouTransitionAdapter();
			}
			@Override
			public Adapter caseTypes(Types object) {
				return createTypesAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseValues(Values object) {
				return createValuesAdapter();
			}
			@Override
			public Adapter caseMemberValue(MemberValue object) {
				return createMemberValueAdapter();
			}
			@Override
			public Adapter caseRepititionValue(RepititionValue object) {
				return createRepititionValueAdapter();
			}
			@Override
			public Adapter caseEnumerationValue(EnumerationValue object) {
				return createEnumerationValueAdapter();
			}
			@Override
			public Adapter caseInputVariable(InputVariable object) {
				return createInputVariableAdapter();
			}
			@Override
			public Adapter caseOutputVariable(OutputVariable object) {
				return createOutputVariableAdapter();
			}
			@Override
			public Adapter caseInputOutputVariable(InputOutputVariable object) {
				return createInputOutputVariableAdapter();
			}
			@Override
			public Adapter caseVariableType6(VariableType6 object) {
				return createVariableType6Adapter();
			}
			@Override
			public Adapter caseVarList(VarList object) {
				return createVarListAdapter();
			}
			@Override
			public Adapter caseVarListAccess(VarListAccess object) {
				return createVarListAccessAdapter();
			}
			@Override
			public Adapter caseVarListConfig(VarListConfig object) {
				return createVarListConfigAdapter();
			}
			@Override
			public Adapter caseVarListPlain(VarListPlain object) {
				return createVarListPlainAdapter();
			}
			@Override
			public Adapter caseVendorElement(VendorElement object) {
				return createVendorElementAdapter();
			}
			@Override
			public Adapter caseWstring(Wstring object) {
				return createWstringAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.AccessVariable <em>Access Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.AccessVariable
	 * @generated
	 */
	public Adapter createAccessVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ActionBlock
	 * @generated
	 */
	public Adapter createActionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Actions
	 * @generated
	 */
	public Adapter createActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ActionObject <em>Action Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ActionObject
	 * @generated
	 */
	public Adapter createActionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.PouAction <em>Pou Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.PouAction
	 * @generated
	 */
	public Adapter createPouActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.AddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.AddData
	 * @generated
	 */
	public Adapter createAddDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.AddDataInfo <em>Add Data Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.AddDataInfo
	 * @generated
	 */
	public Adapter createAddDataInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ArrayValue
	 * @generated
	 */
	public Adapter createArrayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Body
	 * @generated
	 */
	public Adapter createBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Coil <em>Coil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Coil
	 * @generated
	 */
	public Adapter createCoilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Configurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Configurations
	 * @generated
	 */
	public Adapter createConfigurationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConfigVariable <em>Config Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConfigVariable
	 * @generated
	 */
	public Adapter createConfigVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointIn
	 * @generated
	 */
	public Adapter createConnectionPointInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOut
	 * @generated
	 */
	public Adapter createConnectionPointOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointOutAction <em>Connection Point Out Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutAction
	 * @generated
	 */
	public Adapter createConnectionPointOutActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.FormalConnectionPointOut <em>Formal Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.FormalConnectionPointOut
	 * @generated
	 */
	public Adapter createFormalConnectionPointOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Contact
	 * @generated
	 */
	public Adapter createContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ContentHeader <em>Content Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ContentHeader
	 * @generated
	 */
	public Adapter createContentHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Continuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Continuation
	 * @generated
	 */
	public Adapter createContinuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.CoordinateInfo <em>Coordinate Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.CoordinateInfo
	 * @generated
	 */
	public Adapter createCoordinateInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DataTypes
	 * @generated
	 */
	public Adapter createDataTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DataTypeType <em>Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DataTypeType
	 * @generated
	 */
	public Adapter createDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Derived
	 * @generated
	 */
	public Adapter createDerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Error
	 * @generated
	 */
	public Adapter createErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ExternalVars <em>External Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ExternalVars
	 * @generated
	 */
	public Adapter createExternalVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.FbdTypeInfo <em>Fbd Type Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.FbdTypeInfo
	 * @generated
	 */
	public Adapter createFbdTypeInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.FBD <em>FBD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.FBD
	 * @generated
	 */
	public Adapter createFBDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.FileHeader <em>File Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.FileHeader
	 * @generated
	 */
	public Adapter createFileHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.FormattedText <em>Formatted Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.FormattedText
	 * @generated
	 */
	public Adapter createFormattedTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.GlobalVars <em>Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.GlobalVars
	 * @generated
	 */
	public Adapter createGlobalVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Info
	 * @generated
	 */
	public Adapter createInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Inline
	 * @generated
	 */
	public Adapter createInlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InOutVariables <em>In Out Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InOutVariables
	 * @generated
	 */
	public Adapter createInOutVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InOutVariable <em>In Out Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InOutVariable
	 * @generated
	 */
	public Adapter createInOutVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InOutVars <em>In Out Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InOutVars
	 * @generated
	 */
	public Adapter createInOutVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InputVariables <em>Input Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InputVariables
	 * @generated
	 */
	public Adapter createInputVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InputVars <em>Input Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InputVars
	 * @generated
	 */
	public Adapter createInputVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Instances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Instances
	 * @generated
	 */
	public Adapter createInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InVariable <em>In Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InVariable
	 * @generated
	 */
	public Adapter createInVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.JumpStep <em>Jump Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.JumpStep
	 * @generated
	 */
	public Adapter createJumpStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Jump
	 * @generated
	 */
	public Adapter createJumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.LdTypeInfo <em>Ld Type Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.LdTypeInfo
	 * @generated
	 */
	public Adapter createLdTypeInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.LD <em>LD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.LD
	 * @generated
	 */
	public Adapter createLDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.LeftPowerRail <em>Left Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.LeftPowerRail
	 * @generated
	 */
	public Adapter createLeftPowerRailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.LocalVars <em>Local Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.LocalVars
	 * @generated
	 */
	public Adapter createLocalVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.MacroStep <em>Macro Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.MacroStep
	 * @generated
	 */
	public Adapter createMacroStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.OutputVariables <em>Output Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.OutputVariables
	 * @generated
	 */
	public Adapter createOutputVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.OutputVars <em>Output Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.OutputVars
	 * @generated
	 */
	public Adapter createOutputVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.OutVariable <em>Out Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.OutVariable
	 * @generated
	 */
	public Adapter createOutVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.PageSize <em>Page Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.PageSize
	 * @generated
	 */
	public Adapter createPageSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Pointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Pointer
	 * @generated
	 */
	public Adapter createPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.PouInstance <em>Pou Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.PouInstance
	 * @generated
	 */
	public Adapter createPouInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Pous <em>Pous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Pous
	 * @generated
	 */
	public Adapter createPousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Pou <em>Pou</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Pou
	 * @generated
	 */
	public Adapter createPouAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.RangeSigned <em>Range Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.RangeSigned
	 * @generated
	 */
	public Adapter createRangeSignedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.RangeUnsigned <em>Range Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.RangeUnsigned
	 * @generated
	 */
	public Adapter createRangeUnsignedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ReturnType
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.RightPowerRail <em>Right Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.RightPowerRail
	 * @generated
	 */
	public Adapter createRightPowerRailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Scaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Scaling
	 * @generated
	 */
	public Adapter createScalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SelectionConvergence <em>Selection Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SelectionConvergence
	 * @generated
	 */
	public Adapter createSelectionConvergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SelectionDivergenceType <em>Selection Divergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType
	 * @generated
	 */
	public Adapter createSelectionDivergenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SfcTypeInfo <em>Sfc Type Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SfcTypeInfo
	 * @generated
	 */
	public Adapter createSfcTypeInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SFC <em>SFC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SFC
	 * @generated
	 */
	public Adapter createSFCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SimpleValue <em>Simple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SimpleValue
	 * @generated
	 */
	public Adapter createSimpleValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Vergence <em>Vergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Vergence
	 * @generated
	 */
	public Adapter createVergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SimultaneousConvergence <em>Simultaneous Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergence
	 * @generated
	 */
	public Adapter createSimultaneousConvergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SimultaneousDivergence <em>Simultaneous Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergence
	 * @generated
	 */
	public Adapter createSimultaneousDivergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.StructValue <em>Struct Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.StructValue
	 * @generated
	 */
	public Adapter createStructValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SubrangeSigned <em>Subrange Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SubrangeSigned
	 * @generated
	 */
	public Adapter createSubrangeSignedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SubrangeUnsigned <em>Subrange Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SubrangeUnsigned
	 * @generated
	 */
	public Adapter createSubrangeUnsignedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.TempVars <em>Temp Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.TempVars
	 * @generated
	 */
	public Adapter createTempVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SfcTransitions <em>Sfc Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SfcTransitions
	 * @generated
	 */
	public Adapter createSfcTransitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SfcTransition <em>Sfc Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SfcTransition
	 * @generated
	 */
	public Adapter createSfcTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.PouTransition <em>Pou Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.PouTransition
	 * @generated
	 */
	public Adapter createPouTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Types
	 * @generated
	 */
	public Adapter createTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Values <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Values
	 * @generated
	 */
	public Adapter createValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.MemberValue <em>Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.MemberValue
	 * @generated
	 */
	public Adapter createMemberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.RepititionValue <em>Repitition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.RepititionValue
	 * @generated
	 */
	public Adapter createRepititionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.EnumerationValue <em>Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.EnumerationValue
	 * @generated
	 */
	public Adapter createEnumerationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InputVariable
	 * @generated
	 */
	public Adapter createInputVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.OutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.OutputVariable
	 * @generated
	 */
	public Adapter createOutputVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InputOutputVariable <em>Input Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InputOutputVariable
	 * @generated
	 */
	public Adapter createInputOutputVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VariableType6 <em>Variable Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VariableType6
	 * @generated
	 */
	public Adapter createVariableType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VarList <em>Var List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VarList
	 * @generated
	 */
	public Adapter createVarListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VarListAccess <em>Var List Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VarListAccess
	 * @generated
	 */
	public Adapter createVarListAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VarListConfig <em>Var List Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VarListConfig
	 * @generated
	 */
	public Adapter createVarListConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VarListPlain <em>Var List Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VarListPlain
	 * @generated
	 */
	public Adapter createVarListPlainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VendorElement <em>Vendor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VendorElement
	 * @generated
	 */
	public Adapter createVendorElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Wstring <em>Wstring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Wstring
	 * @generated
	 */
	public Adapter createWstringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Tc60201AdapterFactory
