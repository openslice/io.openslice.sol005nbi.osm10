package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.InstantiationParameters;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.NetworkSliceTemplate;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.NsrRefList;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.NsrRefListKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.VlrList;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.VlrListKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * grouping nsi {
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf nst-ref {
 *     type leafref {
 *       path /nst:nst/nst:id;
 *     }
 *   }
 *   container instantiation-parameters {
 *     uses netslice-instantiation-parameters:netslice_params;
 *   }
 *   container network-slice-template {
 *     uses nst:network-slice;
 *   }
 *   list nsr-ref-list {
 *     config false;
 *     key nsr-ref;
 *     leaf nsr-ref {
 *       config false;
 *       type leafref {
 *         path /osm-project:project/nsr:ns-instance-opdata/nsr:nsr/nsr:ns-instance-config-ref;
 *       }
 *     }
 *   }
 *   list vlr-list {
 *     config false;
 *     key id;
 *     leaf id {
 *       config false;
 *       type yang:uuid;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi</i>
 *
 */
public interface Nsi$G
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsi");

    @Override
    Class<? extends Nsi$G> implementedInterface();
    
    /**
     * Identifier for the NSI.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getId();
    
    /**
     * NSI name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * NSI short name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    @Nullable String getShortName();
    
    /**
     * NSI description.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * @return <code>java.lang.String</code> <code>nstRef</code>, or <code>null</code> if not present
     */
    @Nullable String getNstRef();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.InstantiationParameters</code> <code>instantiationParameters</code>, or <code>null</code> if not present
     */
    @Nullable InstantiationParameters getInstantiationParameters();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.NetworkSliceTemplate</code> <code>networkSliceTemplate</code>, or <code>null</code> if not present
     */
    @Nullable NetworkSliceTemplate getNetworkSliceTemplate();
    
    /**
     * @return <code>java.util.Map</code> <code>nsrRefList</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsrRefListKey, NsrRefList> getNsrRefList();
    
    /**
     * @return <code>java.util.Map</code> <code>nsrRefList</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsrRefListKey, NsrRefList> nonnullNsrRefList() {
        return CodeHelpers.nonnull(getNsrRefList());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>vlrList</code>, or <code>null</code> if not present
     */
    @Nullable Map<VlrListKey, VlrList> getVlrList();
    
    /**
     * @return <code>java.util.Map</code> <code>vlrList</code>, or an empty list if it is not present
     */
    default @NonNull Map<VlrListKey, VlrList> nonnullVlrList() {
        return CodeHelpers.nonnull(getVlrList());
    }

}

