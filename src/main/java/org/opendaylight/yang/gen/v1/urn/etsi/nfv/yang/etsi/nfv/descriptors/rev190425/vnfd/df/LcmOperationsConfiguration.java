package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ChangeExtVnfConnectivityOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ChangeVnfFlavourOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.HealVnfOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.InstantiateVnfOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.OperateVnfOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ScaleVnfOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ScaleVnfToLevelOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.TerminateVnfOpConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This information element is a container for all attributes that affect the 
 * invocation of the VNF Lifecycle Management operations, structured by operation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container lcm-operations-configuration {
 *   container instantiate-vnf-op-config {
 *     list parameter {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   container scale-vnf-op-config {
 *     list parameter {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *     leaf scaling-by-more-than-one-step-supported {
 *       type boolean;
 *       default false;
 *     }
 *   }
 *   container scale-vnf-to-level-op-config {
 *     list parameter {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *     leaf arbitrary-target-levels-supported {
 *       type boolean;
 *       default false;
 *     }
 *   }
 *   container heal-vnf-op-config {
 *     list parameter {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *     leaf-list cause {
 *       type string;
 *     }
 *   }
 *   container terminate-vnf-op-config {
 *     leaf min-graceful-termination {
 *       type yang:timeticks;
 *       default 1;
 *     }
 *     leaf max-recommended-graceful-termination {
 *       type yang:timeticks;
 *     }
 *     list parameter {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   container operate-vnf-op-config {
 *     leaf min-graceful-stop-timeout {
 *       type yang:timeticks;
 *       default 1;
 *     }
 *     leaf max-recommended-graceful-stop-timeout {
 *       type yang:timeticks;
 *     }
 *     list parameter {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   container change-vnf-flavour-op-config {
 *     list parameter {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   container change-ext-vnf-connectivity-op-config {
 *     list parameter {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/lcm-operations-configuration</i>
 * 
 * <p>To create instances of this class use {@link LcmOperationsConfigurationBuilder}.
 * @see LcmOperationsConfigurationBuilder
 *
 */
public interface LcmOperationsConfiguration
    extends
    ChildOf<Df>,
    Augmentable<LcmOperationsConfiguration>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("lcm-operations-configuration");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.LcmOperationsConfiguration> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.LcmOperationsConfiguration.class;
    }
    
    /**
     * Configuration parameters for the InstantiateVnf operation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.InstantiateVnfOpConfig</code> <code>instantiateVnfOpConfig</code>, or <code>null</code> if not present
     */
    @Nullable InstantiateVnfOpConfig getInstantiateVnfOpConfig();
    
    /**
     * Configuration parameters for the ScaleVnf operation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ScaleVnfOpConfig</code> <code>scaleVnfOpConfig</code>, or <code>null</code> if not present
     */
    @Nullable ScaleVnfOpConfig getScaleVnfOpConfig();
    
    /**
     * This information element defines attributes that affect the invocation of the
     * ScaleVnfToLevel operation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ScaleVnfToLevelOpConfig</code> <code>scaleVnfToLevelOpConfig</code>, or <code>null</code> if not present
     */
    @Nullable ScaleVnfToLevelOpConfig getScaleVnfToLevelOpConfig();
    
    /**
     * This information element defines attributes that affect the invocation of the
     * HealVnf operation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.HealVnfOpConfig</code> <code>healVnfOpConfig</code>, or <code>null</code> if not present
     */
    @Nullable HealVnfOpConfig getHealVnfOpConfig();
    
    /**
     * This information element defines attributes that affect the invocation of the
     * TerminateVnf operation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.TerminateVnfOpConfig</code> <code>terminateVnfOpConfig</code>, or <code>null</code> if not present
     */
    @Nullable TerminateVnfOpConfig getTerminateVnfOpConfig();
    
    /**
     * This information element defines attributes that affect the invocation of the
     * OperateVnf operation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.OperateVnfOpConfig</code> <code>operateVnfOpConfig</code>, or <code>null</code> if not present
     */
    @Nullable OperateVnfOpConfig getOperateVnfOpConfig();
    
    /**
     * Configuration parameters for the ChangeVnfFlavour operation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ChangeVnfFlavourOpConfig</code> <code>changeVnfFlavourOpConfig</code>, or <code>null</code> if not present
     */
    @Nullable ChangeVnfFlavourOpConfig getChangeVnfFlavourOpConfig();
    
    /**
     * Configuration parameters for the ChangeExtVnfConnectivity operation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ChangeExtVnfConnectivityOpConfig</code> <code>changeExtVnfConnectivityOpConfig</code>, or <code>null</code> if not present
     */
    @Nullable ChangeExtVnfConnectivityOpConfig getChangeExtVnfConnectivityOpConfig();

}

