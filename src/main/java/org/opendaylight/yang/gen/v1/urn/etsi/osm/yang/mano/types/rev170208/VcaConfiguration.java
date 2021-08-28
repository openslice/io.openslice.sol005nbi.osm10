package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.ConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.ConfigPrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.InitialConfigPrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.TerminateConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.TerminateConfigPrimitiveKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Common information in the descriptors for NS, VNF or VDU configuration. Note: 
 * the NS contains multiple instances of the same VNF or VDU, each instance could 
 * have a different configuration.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vca-configuration {
 *   uses manotypes:configuration-method;
 *   list config-primitive {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf execution-environment-ref {
 *       type leafref {
 *         path ../../execution-environment-list/id;
 *       }
 *     }
 *     leaf execution-environment-primitive {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       uses primitive-parameter;
 *     }
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 *   list initial-config-primitive {
 *     key seq;
 *     leaf seq {
 *       type uint64;
 *     }
 *     choice primitive-type {
 *       case primitive-definition {
 *         leaf name {
 *           type string;
 *         }
 *         leaf execution-environment-ref {
 *           type leafref {
 *             path ../../execution-environment-list/id;
 *           }
 *         }
 *         uses primitive-parameter-value;
 *         leaf user-defined-script {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 *   list terminate-config-primitive {
 *     key seq;
 *     leaf seq {
 *       type uint64;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf execution-environment-ref {
 *       type leafref {
 *         path ../../execution-environment-list/id;
 *       }
 *     }
 *     uses primitive-parameter-value;
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 *   uses manotypes:vca-metrics;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration</i>
 *
 */
public interface VcaConfiguration
    extends
    DataObject,
    ConfigurationMethod,
    VcaMetrics
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vca-configuration");

    @Override
    Class<? extends VcaConfiguration> implementedInterface();
    
    /**
     * List of config primitives supported by the configuration agent for this VNF or
     * VDU.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>configPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConfigPrimitiveKey, ConfigPrimitive> getConfigPrimitive();
    
    /**
     * @return <code>java.util.Map</code> <code>configPrimitive</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConfigPrimitiveKey, ConfigPrimitive> nonnullConfigPrimitive() {
        return CodeHelpers.nonnull(getConfigPrimitive());
    }
    
    /**
     * Initial set of configuration primitives.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>initialConfigPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> getInitialConfigPrimitive();
    
    /**
     * @return <code>java.util.Map</code> <code>initialConfigPrimitive</code>, or an empty list if it is not present
     */
    default @NonNull Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> nonnullInitialConfigPrimitive() {
        return CodeHelpers.nonnull(getInitialConfigPrimitive());
    }
    
    /**
     * Terminate set of configuration primitives.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>terminateConfigPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> getTerminateConfigPrimitive();
    
    /**
     * @return <code>java.util.Map</code> <code>terminateConfigPrimitive</code>, or an empty list if it is not present
     */
    default @NonNull Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> nonnullTerminateConfigPrimitive() {
        return CodeHelpers.nonnull(getTerminateConfigPrimitive());
    }

}

