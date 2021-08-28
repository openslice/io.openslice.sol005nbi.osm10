package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.AlarmKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImagesKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.InterfaceKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.MonitoringParamKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.VduConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Volumes;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.VolumesKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * List of Virtual Deployment Units
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list vdu {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf pdu-type {
 *     type string;
 *   }
 *   leaf count {
 *     type uint64;
 *   }
 *   leaf mgmt-vpci {
 *     type string;
 *   }
 *   uses manotypes:vm-flavor;
 *   uses manotypes:guest-epa;
 *   uses manotypes:vswitch-epa;
 *   uses manotypes:hypervisor-epa;
 *   uses manotypes:host-epa;
 *   list alarm {
 *     key alarm-id;
 *     leaf alarm-id {
 *       type string;
 *     }
 *     leaf vnf-monitoring-param-ref {
 *       type leafref {
 *         path ../../monitoring-param/id;
 *       }
 *     }
 *     uses manotypes:alarm-properties;
 *   }
 *   uses manotypes:image-properties;
 *   list alternative-images {
 *     key vim-type;
 *     leaf vim-type {
 *       type string;
 *     }
 *     uses manotypes:image-properties;
 *   }
 *   container vdu-configuration {
 *     uses manotypes:vca-configuration;
 *     uses manotypes:vca-config-access;
 *   }
 *   list monitoring-param {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf nfvi-metric {
 *       type manotypes:nfvi-metric-type;
 *     }
 *     leaf interface-name-ref {
 *       type leafref {
 *         path ../../interface/name;
 *       }
 *     }
 *   }
 *   choice cloud-init-input {
 *     case inline {
 *       leaf cloud-init {
 *         type string;
 *       }
 *     }
 *     case filename {
 *       leaf cloud-init-file {
 *         type string;
 *       }
 *     }
 *   }
 *   uses manotypes:supplemental-boot-data;
 *   list internal-connection-point {
 *     key id;
 *     uses common-connection-point;
 *     leaf internal-vld-ref {
 *       type leafref {
 *         path ../../../internal-vld/id;
 *       }
 *     }
 *   }
 *   list interface {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf position {
 *       type uint32;
 *     }
 *     leaf mgmt-interface {
 *       type boolean;
 *       default false;
 *     }
 *     leaf type {
 *       type interface-type;
 *       default EXTERNAL;
 *     }
 *     leaf mac-address {
 *       type string;
 *     }
 *     choice connection-point-type {
 *       case internal {
 *         leaf internal-connection-point-ref {
 *           type leafref {
 *             path ../../internal-connection-point/id;
 *           }
 *         }
 *       }
 *       case external {
 *         leaf external-connection-point-ref {
 *           type leafref {
 *             path ../../../connection-point/name;
 *           }
 *         }
 *       }
 *     }
 *     uses virtual-interface;
 *   }
 *   list volumes {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:volume-info;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu</i>
 * 
 * <p>To create instances of this class use {@link VduBuilder}.
 * @see VduBuilder
 * @see VduKey
 *
 */
public interface Vdu
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<Vdu>,
    VmFlavor,
    GuestEpa,
    VswitchEpa,
    HypervisorEpa,
    HostEpa,
    ImageProperties,
    SupplementalBootData,
    Identifiable<VduKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Vdu> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Vdu.class;
    }
    
    /**
     * Unique id for the VDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Unique name for the VDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Description of the VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * Type of PDU. If this field exists, the deployment unit must be understood as a
     * PDU, not as a VDU. This field is used to identify the category of PDU instances
     * to be used at instantiation time. For the instantiation to be successful, there
     * must be available PDU instances of this type in the selected datacenter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>pduType</code>, or <code>null</code> if not present
     */
    @Nullable String getPduType();
    
    /**
     * Number of instances of VDU
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getCount();
    
    /**
     * Specifies the virtual PCI address. Expressed in the following format
     * dddd:dd:dd.d. For example 0000:00:12.0. This information can be used to pass as
     * metadata during the VM creation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mgmtVpci</code>, or <code>null</code> if not present
     */
    @Nullable String getMgmtVpci();
    
    /**
     * @return <code>java.util.Map</code> <code>alarm</code>, or <code>null</code> if not present
     */
    @Nullable Map<AlarmKey, Alarm> getAlarm();
    
    /**
     * @return <code>java.util.Map</code> <code>alarm</code>, or an empty list if it is not present
     */
    default @NonNull Map<AlarmKey, Alarm> nonnullAlarm() {
        return CodeHelpers.nonnull(getAlarm());
    }
    
    /**
     * List of alternative images per VIM type. Different images can be used for
     * specific types of VIMs instead of the default image. This allows deployments in
     * sites where the image identifier in the VIM is given by the VIM provider and
     * cannot be modified. If an alternative image is specified for a VIM type, it will
     * prevail over the default image
     *
     *
     *
     * @return <code>java.util.Map</code> <code>alternativeImages</code>, or <code>null</code> if not present
     */
    @Nullable Map<AlternativeImagesKey, AlternativeImages> getAlternativeImages();
    
    /**
     * @return <code>java.util.Map</code> <code>alternativeImages</code>, or an empty list if it is not present
     */
    default @NonNull Map<AlternativeImagesKey, AlternativeImages> nonnullAlternativeImages() {
        return CodeHelpers.nonnull(getAlternativeImages());
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.VduConfiguration</code> <code>vduConfiguration</code>, or <code>null</code> if not present
     */
    @Nullable VduConfiguration getVduConfiguration();
    
    /**
     * List of VDU-related monitoring parameters at NFVI level
     *
     *
     *
     * @return <code>java.util.Map</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable Map<MonitoringParamKey, MonitoringParam> getMonitoringParam();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoringParam</code>, or an empty list if it is not present
     */
    default @NonNull Map<MonitoringParamKey, MonitoringParam> nonnullMonitoringParam() {
        return CodeHelpers.nonnull(getMonitoringParam());
    }
    
    /**
     * Indicates how the contents of cloud-init script are provided. There are 2
     * choices - inline or in a file
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput</code> <code>cloudInitInput</code>, or <code>null</code> if not present
     */
    @Nullable CloudInitInput getCloudInitInput();
    
    /**
     * List for internal connection points. Each VNFC has zero or more internal
     * connection points. Internal connection points are used for connecting the VNF
     * with components internal to the VNF. If a VNF has only one VNFC, it may not have
     * any internal connection points.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable Map<InternalConnectionPointKey, InternalConnectionPoint> getInternalConnectionPoint();
    
    /**
     * @return <code>java.util.Map</code> <code>internalConnectionPoint</code>, or an empty list if it is not present
     */
    default @NonNull Map<InternalConnectionPointKey, InternalConnectionPoint> nonnullInternalConnectionPoint() {
        return CodeHelpers.nonnull(getInternalConnectionPoint());
    }
    
    /**
     * List of Interfaces (external and internal) for the VNF
     *
     *
     *
     * @return <code>java.util.Map</code> <code>interface</code>, or <code>null</code> if not present
     */
    @Nullable Map<InterfaceKey, Interface> getInterface();
    
    /**
     * @return <code>java.util.Map</code> <code>interface</code>, or an empty list if it is not present
     */
    default @NonNull Map<InterfaceKey, Interface> nonnullInterface() {
        return CodeHelpers.nonnull(getInterface());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>volumes</code>, or <code>null</code> if not present
     */
    @Nullable Map<VolumesKey, Volumes> getVolumes();
    
    /**
     * @return <code>java.util.Map</code> <code>volumes</code>, or an empty list if it is not present
     */
    default @NonNull Map<VolumesKey, Volumes> nonnullVolumes() {
        return CodeHelpers.nonnull(getVolumes());
    }
    
    @Override
    VduKey key();

}

