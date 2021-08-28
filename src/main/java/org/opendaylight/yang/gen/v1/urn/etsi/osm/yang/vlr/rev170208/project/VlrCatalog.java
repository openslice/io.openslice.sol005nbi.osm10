package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.project;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.Project1;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.project.vlr.catalog.Vlr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.project.vlr.catalog.VlrKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vlr</b>
 * <pre>
 * container vlr-catalog {
 *   leaf schema-version {
 *     type string;
 *     default v3.0;
 *   }
 *   config false;
 *   list vlr {
 *     key id;
 *     unique name;
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf nsr-id-ref {
 *       type yang:uuid;
 *     }
 *     leaf vld-ref {
 *       type string;
 *     }
 *     leaf res-id {
 *       type yang:uuid;
 *     }
 *     leaf short-name {
 *       type string;
 *     }
 *     leaf vendor {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf version {
 *       type string;
 *     }
 *     leaf type {
 *       type manotypes:virtual-link-type;
 *     }
 *     leaf root-bandwidth {
 *       type uint64;
 *     }
 *     leaf leaf-bandwidth {
 *       type uint64;
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf uptime {
 *       type uint32;
 *     }
 *     leaf network-id {
 *       type string;
 *     }
 *     leaf vim-network-name {
 *       type string;
 *     }
 *     uses manotypes:provider-network;
 *     uses manotypes:ip-profile-info;
 *     leaf status {
 *       type enumeration {
 *         enum LINK_UP;
 *         enum DEGRADED;
 *         enum LINK_DOWN;
 *       }
 *     }
 *     leaf operational-status {
 *       type enumeration {
 *         enum init;
 *         enum vl-alloc-pending;
 *         enum running;
 *         enum vl-terminate-pending;
 *         enum terminated;
 *         enum failed;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vlr/project/(urn:etsi:osm:yang:vlr?revision=2017-02-08)vlr-catalog</i>
 * 
 * <p>To create instances of this class use {@link VlrCatalogBuilder}.
 * @see VlrCatalogBuilder
 *
 */
public interface VlrCatalog
    extends
    ChildOf<Project1>,
    Augmentable<VlrCatalog>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vlr-catalog");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.project.VlrCatalog> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.project.VlrCatalog.class;
    }
    
    /**
     * Schema version for the VLR. If unspecified, it assumes v3.0
     *
     *
     *
     * @return <code>java.lang.String</code> <code>schemaVersion</code>, or <code>null</code> if not present
     */
    @Nullable String getSchemaVersion();
    
    /**
     * @return <code>java.util.Map</code> <code>vlr</code>, or <code>null</code> if not present
     */
    @Nullable Map<VlrKey, Vlr> getVlr();
    
    /**
     * @return <code>java.util.Map</code> <code>vlr</code>, or an empty list if it is not present
     */
    default @NonNull Map<VlrKey, Vlr> nonnullVlr() {
        return CodeHelpers.nonnull(getVlr());
    }

}

