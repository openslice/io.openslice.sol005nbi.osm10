package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.StorageType;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDescBuilder.VirtualStorageDescImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.storage.desc.VduStorageRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.storage.desc.VduStorageRequirementsKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Storage requirements for a Virtual Storage instance attached to the VNFC 
 * from this VDU
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list virtual-storage-desc {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf type-of-storage {
 *     default root-storage;
 *     type identityref {
 *       base storage-type;
 *     }
 *   }
 *   leaf size-of-storage {
 *     type uint64;
 *     units GB;
 *     default 0;
 *   }
 *   list vdu-storage-requirements {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 *   leaf rdma-enabled {
 *     type boolean;
 *   }
 *   leaf sw-image-desc {
 *     type leafref {
 *       path ../../sw-image-desc/id;
 *     }
 *     must "../size-of-storage &gt;=../../sw-image-desc[id=current()]/min-disk";
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/virtual-storage-desc</i>
 * 
 * <p>To create instances of this class use {@link VirtualStorageDescBuilder}.
 * @see VirtualStorageDescBuilder
 * @see VirtualStorageDescKey
 *
 */
@JsonDeserialize(as = VirtualStorageDescImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface VirtualStorageDesc
    extends
    ChildOf<Vnfd>,
    Augmentable<VirtualStorageDesc>,
    Identifiable<VirtualStorageDescKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-storage-desc");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDesc> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDesc.class;
    }
    
    /**
     * Unique identifier of this VirtualStorageDesc in the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Type of virtualised storage resource (e.g. volume, object).
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>typeOfStorage</code>, or <code>null</code> if not present
     */
    @Nullable Class<? extends StorageType> getTypeOfStorage();
    
    /**
     * Size of virtualised storage resource (e.g. size of volume, in GB)
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>sizeOfStorage</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getSizeOfStorage();
    
    /**
     * Array of key-value pairs that articulate the storage deployment requirements.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vduStorageRequirements</code>, or <code>null</code> if not present
     */
    @Nullable Map<VduStorageRequirementsKey, VduStorageRequirements> getVduStorageRequirements();
    
    /**
     * @return <code>java.util.Map</code> <code>vduStorageRequirements</code>, or an empty list if it is not present
     */
    default @NonNull Map<VduStorageRequirementsKey, VduStorageRequirements> nonnullVduStorageRequirements() {
        return CodeHelpers.nonnull(getVduStorageRequirements());
    }
    
    /**
     * Indicate if the storage support RDMA.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>rdmaEnabled</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isRdmaEnabled();
    
    /**
     * Software image to be loaded on the VirtualStorage resource created based on this
     * VirtualStorageDesc.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>swImageDesc</code>, or <code>null</code> if not present
     */
    @Nullable String getSwImageDesc();
    
    @Override
    VirtualStorageDescKey key();

}

