package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.initial.config.primitive.primitive.type;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameterValue;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.initial.config.primitive.PrimitiveType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * case primitive-definition {
 *   leaf name {
 *     type string;
 *   }
 *   leaf execution-environment-ref {
 *     type leafref {
 *       path ../../execution-environment-list/id;
 *     }
 *   }
 *   uses primitive-parameter-value;
 *   leaf user-defined-script {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/vnfc-configuration/initial-config-primitive/primitive-type/primitive-definition</i>
 *
 */
public interface PrimitiveDefinition
    extends
    DataObject,
    Augmentable<PrimitiveDefinition>,
    PrimitiveParameterValue,
    PrimitiveType
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("primitive-definition");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition.class;
    }
    
    /**
     * Name of the configuration primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Leaf reference to the particular execution environment
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>executionEnvironmentRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getExecutionEnvironmentRef();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    @Nullable String getUserDefinedScript();

}

