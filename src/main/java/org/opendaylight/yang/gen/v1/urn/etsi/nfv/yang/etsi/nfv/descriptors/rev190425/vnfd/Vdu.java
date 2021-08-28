package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VduBuilder.VduImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.BootOrder;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.ConfigurableProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.ConfigurablePropertiesKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.IntCpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.IntCpdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.MonitoringParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.MonitoringParameterKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * The Virtualisation Deployment Unit (VDU) is a construct supporting the 
 * description of the deployment and operational behaviour of a VNF component, or 
 * the entire VNF if it was not componentized in components.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list vdu {
 *   key id;
 *   min-elements 1;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   list int-cpd {
 *     key id;
 *     min-elements 1;
 *     leaf int-virtual-link-desc {
 *       type leafref {
 *         path ../../../int-virtual-link-desc/id;
 *       }
 *     }
 *     leaf bitrate-requirement {
 *       type uint64;
 *       units Mbps;
 *     }
 *     uses virtual-network-interface-requirements;
 *     leaf nicio-requirements {
 *       type leafref {
 *         path ../../../virtual-compute-desc/id;
 *       }
 *     }
 *     leaf-list order {
 *       type uint32;
 *     }
 *     uses cpd;
 *     leaf security-group-rule-id {
 *       type leafref {
 *         path ../../../security-group-rule/id;
 *       }
 *     }
 *   }
 *   leaf virtual-compute-desc {
 *     type leafref {
 *       path ../../virtual-compute-desc/id;
 *     }
 *     must "../../virtual-compute-desc[id=current()]/virtual-memory/size &gt;=../../sw-image-desc[id=current()/../sw-image-desc]/min-ram";
 *   }
 *   leaf-list virtual-storage-desc {
 *     type leafref {
 *       path ../../virtual-storage-desc/id;
 *     }
 *   }
 *   list boot-order {
 *     ordered-by user;
 *     key key;
 *     leaf key {
 *       type uint32;
 *     }
 *     leaf value {
 *       type leafref {
 *         path ../../virtual-storage-desc;
 *       }
 *     }
 *   }
 *   leaf sw-image-desc {
 *     type leafref {
 *       path ../../sw-image-desc/id;
 *     }
 *   }
 *   leaf-list nfvi-constraint {
 *     type string;
 *   }
 *   list monitoring-parameter {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     uses monitoring-parameter;
 *   }
 *   list configurable-properties {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 *   leaf boot-data {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/vdu</i>
 * 
 * <p>To create instances of this class use {@link VduBuilder}.
 * @see VduBuilder
 * @see VduKey
 *
 */
@JsonDeserialize(as = VduImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Vdu
    extends
    ChildOf<Vnfd>,
    Augmentable<Vdu>,
    Identifiable<VduKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Vdu> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Vdu.class;
    }
    
    /**
     * Unique identifier of this VDU in VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Human readable name of the VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Human readable description of the VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * A internal-connection-point element is a type of connection point and describes
     * network connectivity between a VDU instance and an internal Virtual Link or an
     * external connection point.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>intCpd</code>, or <code>null</code> if not present
     */
    @Nullable Map<IntCpdKey, IntCpd> getIntCpd();
    
    /**
     * @return <code>java.util.Map</code> <code>intCpd</code>, or an empty list if it is not present
     */
    default @NonNull Map<IntCpdKey, IntCpd> nonnullIntCpd() {
        return CodeHelpers.nonnull(getIntCpd());
    }
    
    /**
     * Describes CPU, Memory and acceleration requirements of the Virtualisation
     * Container realizing this VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>virtualComputeDesc</code>, or <code>null</code> if not present
     */
    @Nullable String getVirtualComputeDesc();
    
    /**
     * Describes storage requirements for a VirtualStorage instance attached to the
     * virtualisation container created from virtualComputeDesc defined for this VDU.
     *
     *
     *
     * @return <code>java.util.List</code> <code>virtualStorageDesc</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getVirtualStorageDesc();
    
    /**
     * The key indicates the boot index (lowest index defines highest boot priority).
     * The Value references a descriptor from which a valid boot device is created e.g.
     * VirtualStorageDesc from which a VirtualStorage instance is created. Editor's
     * note: The boot-order node requires further study.
     *
     *
     *
     * @return <code>java.util.List</code> <code>bootOrder</code>, or <code>null</code> if not present
     */
    @Nullable List<BootOrder> getBootOrder();
    
    /**
     * @return <code>java.util.List</code> <code>bootOrder</code>, or an empty list if it is not present
     */
    default @NonNull List<BootOrder> nonnullBootOrder() {
        return CodeHelpers.nonnull(getBootOrder());
    }
    
    /**
     * Describes the software image which is directly loaded on the virtualisation
     * container realising this Vdu.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>swImageDesc</code>, or <code>null</code> if not present
     */
    @Nullable String getSwImageDesc();
    
    /**
     * Describes constraints on the NFVI for the VNFC instance(s) created from this
     * Vdu. For example, aspects of a secure hosting environment for the VNFC instance
     * that involve additional entities or processes.
     *
     *
     *
     * @return <code>java.util.List</code> <code>nfviConstraint</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getNfviConstraint();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoringParameter</code>, or <code>null</code> if not present
     */
    @Nullable Map<MonitoringParameterKey, MonitoringParameter> getMonitoringParameter();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoringParameter</code>, or an empty list if it is not present
     */
    default @NonNull Map<MonitoringParameterKey, MonitoringParameter> nonnullMonitoringParameter() {
        return CodeHelpers.nonnull(getMonitoringParameter());
    }
    
    /**
     * It provides VNFC configurable properties that can be modified using the
     * ModifyVnfInfo operation.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>configurableProperties</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConfigurablePropertiesKey, ConfigurableProperties> getConfigurableProperties();
    
    /**
     * @return <code>java.util.Map</code> <code>configurableProperties</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConfigurablePropertiesKey, ConfigurableProperties> nonnullConfigurableProperties() {
        return CodeHelpers.nonnull(getConfigurableProperties());
    }
    
    /**
     * Contains a string or a URL to a file contained in the VNF package used to
     * customize a virtualised compute resource at boot time. The bootData may contain
     * variable parts that are replaced by deployment specific values before being sent
     * to the VIM.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>bootData</code>, or <code>null</code> if not present
     */
    @Nullable String getBootData();
    
    @Override
    VduKey key();

}

