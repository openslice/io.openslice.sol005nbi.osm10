package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.LcmOperationsConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.scale.vnf.op.config.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.scale.vnf.op.config.ParameterKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Configuration parameters for the ScaleVnf operation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container scale-vnf-op-config {
 *   list parameter {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 *   leaf scaling-by-more-than-one-step-supported {
 *     type boolean;
 *     default false;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/lcm-operations-configuration/scale-vnf-op-config</i>
 * 
 * <p>To create instances of this class use {@link ScaleVnfOpConfigBuilder}.
 * @see ScaleVnfOpConfigBuilder
 *
 */
public interface ScaleVnfOpConfig
    extends
    ChildOf<LcmOperationsConfiguration>,
    Augmentable<ScaleVnfOpConfig>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scale-vnf-op-config");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ScaleVnfOpConfig> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ScaleVnfOpConfig.class;
    }
    
    /**
     * Array of KVP requirements for VNFspecific parameters to be passed when invoking
     * the ScaleVnf operation.
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
     * Signals whether passing a value larger than one in the numScalingSteps parameter
     * of the ScaleVnf operation is supported by this VNF. Default is FALSE, i.e. 'not
     * supported'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>scalingByMoreThanOneStepSupported</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isScalingByMoreThanOneStepSupported();

}

