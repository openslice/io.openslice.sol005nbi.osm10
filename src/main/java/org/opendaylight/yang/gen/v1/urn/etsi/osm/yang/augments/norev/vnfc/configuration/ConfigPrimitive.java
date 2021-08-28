package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.config.primitive.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.config.primitive.ParameterKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of config primitives supported by the configuration agent for this VNF or 
 * VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * list config-primitive {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf execution-environment-ref {
 *     type leafref {
 *       path ../../execution-environment-list/id;
 *     }
 *   }
 *   leaf execution-environment-primitive {
 *     type string;
 *   }
 *   list parameter {
 *     key name;
 *     uses primitive-parameter;
 *   }
 *   leaf user-defined-script {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/vnfc-configuration/config-primitive</i>
 * 
 * <p>To create instances of this class use {@link ConfigPrimitiveBuilder}.
 * @see ConfigPrimitiveBuilder
 * @see ConfigPrimitiveKey
 *
 */
public interface ConfigPrimitive
    extends
    ChildOf<VnfcConfiguration>,
    Augmentable<ConfigPrimitive>,
    Identifiable<ConfigPrimitiveKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("config-primitive");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.ConfigPrimitive> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.ConfigPrimitive.class;
    }
    
    /**
     * Name of the config primitive.
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
     * Name of the primitive in the execution enviroment. If not explicit, the leaf
     * 'name' will be used as the name of the primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionEnvironmentPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable String getExecutionEnvironmentPrimitive();
    
    /**
     * List of parameters to the config primitive.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>parameter</code>, or <code>null</code> if not present
     */
    @Nullable Map<ParameterKey, Parameter> getParameter();
    
    /**
     * @return <code>java.util.Map</code> <code>parameter</code>, or an empty list if it is not present
     */
    default @NonNull Map<ParameterKey, Parameter> nonnullParameter() {
        return CodeHelpers.nonnull(getParameter());
    }
    
    /**
     * A user defined script. If user defined script is defined, the script will be
     * executed using bash
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    @Nullable String getUserDefinedScript();
    
    @Override
    ConfigPrimitiveKey key();

}

