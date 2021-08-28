package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.LcmOperationsConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.instantiate.vnf.op.config.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.instantiate.vnf.op.config.ParameterKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Configuration parameters for the InstantiateVnf operation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container instantiate-vnf-op-config {
 *   list parameter {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/lcm-operations-configuration/instantiate-vnf-op-config</i>
 * 
 * <p>To create instances of this class use {@link InstantiateVnfOpConfigBuilder}.
 * @see InstantiateVnfOpConfigBuilder
 *
 */
public interface InstantiateVnfOpConfig
    extends
    ChildOf<LcmOperationsConfiguration>,
    Augmentable<InstantiateVnfOpConfig>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("instantiate-vnf-op-config");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.InstantiateVnfOpConfig> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.InstantiateVnfOpConfig.class;
    }
    
    /**
     * Array of KVP requirements for VNF-specific parameters to be passed when invoking
     * the InstantiateVnf operation.
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

}

