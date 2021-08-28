package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VduOperationalStatus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.Vnfr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Interface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InterfaceKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.MonitoringParamKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VolumesKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of Virtual Deployment Units
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list vdur {
 *   key id;
 *   unique name;
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf unique-short-name {
 *     type string;
 *   }
 *   leaf vdu-id-ref {
 *     type leafref {
 *       path ../../vnfd/vdu/id;
 *     }
 *   }
 *   leaf vim-id {
 *     type string;
 *   }
 *   leaf flavor-id {
 *     type string;
 *   }
 *   leaf image-id {
 *     type string;
 *   }
 *   leaf management-ip {
 *     type inet:ip-address;
 *   }
 *   leaf vm-management-ip {
 *     type inet:ip-address;
 *   }
 *   leaf console-url {
 *     type inet:uri;
 *   }
 *   uses manotypes:vm-flavor;
 *   uses manotypes:guest-epa;
 *   uses manotypes:vswitch-epa;
 *   uses manotypes:hypervisor-epa;
 *   uses manotypes:host-epa;
 *   uses manotypes:supplemental-boot-data;
 *   container vdu-configuration {
 *     uses manotypes:vca-configuration;
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
 *   list volumes {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf volume-id {
 *       type string;
 *     }
 *     uses manotypes:volume-info;
 *   }
 *   list internal-connection-point {
 *     key id;
 *     uses vnfd-base:common-connection-point;
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf mac-address {
 *       type string;
 *     }
 *     leaf connection-point-id {
 *       type string;
 *     }
 *     uses associated-virtual-cps;
 *   }
 *   list interface {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf position {
 *       type uint32;
 *     }
 *     leaf type {
 *       type vnfd-base:interface-type;
 *       default EXTERNAL;
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
 *   leaf operational-status {
 *     type vdu-operational-status;
 *   }
 *   uses placement-group-info;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur</i>
 * 
 * <p>To create instances of this class use {@link VdurBuilder}.
 * @see VdurBuilder
 * @see VdurKey
 *
 */
public interface Vdur
    extends
    ChildOf<Vnfr>,
    Augmentable<Vdur>,
    VmFlavor,
    GuestEpa,
    VswitchEpa,
    HypervisorEpa,
    HostEpa,
    SupplementalBootData,
    PlacementGroupInfo,
    Identifiable<VdurKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdur");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur.class;
    }
    
    /**
     * Unique id for the VDU
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getId();
    
    /**
     * name of the instantiated VDUR
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Short Unique name of the VDU This will be of the format NSR
     * name-ShortnedString-VDUname NSR name and VDU name shall be constrained to 10
     * characters
     *
     *
     *
     * @return <code>java.lang.String</code> <code>uniqueShortName</code>, or <code>null</code> if not present
     */
    @Nullable String getUniqueShortName();
    
    /**
     * @return <code>java.lang.String</code> <code>vduIdRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVduIdRef();
    
    /**
     * Allocated VM resource id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimId</code>, or <code>null</code> if not present
     */
    @Nullable String getVimId();
    
    /**
     * VIM assigned flavor id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>flavorId</code>, or <code>null</code> if not present
     */
    @Nullable String getFlavorId();
    
    /**
     * VIM assigned image id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>imageId</code>, or <code>null</code> if not present
     */
    @Nullable String getImageId();
    
    /**
     * Management IP address
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>managementIp</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getManagementIp();
    
    /**
     * VM Private Management IP address
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>vmManagementIp</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getVmManagementIp();
    
    /**
     * Console URL for this VDU, if available
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri</code> <code>consoleUrl</code>, or <code>null</code> if not present
     */
    @Nullable Uri getConsoleUrl();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration</code> <code>vduConfiguration</code>, or <code>null</code> if not present
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
     * @return <code>java.util.Map</code> <code>volumes</code>, or <code>null</code> if not present
     */
    @Nullable Map<VolumesKey, Volumes> getVolumes();
    
    /**
     * @return <code>java.util.Map</code> <code>volumes</code>, or an empty list if it is not present
     */
    default @NonNull Map<VolumesKey, Volumes> nonnullVolumes() {
        return CodeHelpers.nonnull(getVolumes());
    }
    
    /**
     * List for internal connection points. Each VNFC has zero or more internal
     * connection points. Internal connection points are used for connecting the VNF
     * components internal to the VNF. If a VNF has only one VNFC, it may not have any
     * internal connection points.
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
     * List of interfaces (internal and external) for the VNF
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
     * The operational status of the VDU init : The VDU has just started. vm-init-phase
     * : The VDUs in the VNF is being created in VIM. vm-alloc-pending : The VM alloc
     * is pending in VIM running : The VDU is active in VM upgrading : The VDU is being
     * upgraded (EXPERIMENTAL) terminate : The VDU is being terminated
     * vm-terminate-phase : The VDU in the VNF is being terminated in VIM. terminated :
     * The VDU is in the terminated state. failed : The VDU instantiation failed. 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VduOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    @Nullable VduOperationalStatus getOperationalStatus();
    
    @Override
    VdurKey key();

}

