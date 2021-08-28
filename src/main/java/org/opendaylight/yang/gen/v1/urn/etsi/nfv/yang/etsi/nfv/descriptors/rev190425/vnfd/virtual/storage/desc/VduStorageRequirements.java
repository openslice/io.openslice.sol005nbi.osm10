package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.storage.desc;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDesc;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Array of key-value pairs that articulate the storage deployment requirements.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list vdu-storage-requirements {
 *   key key;
 *   leaf key {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/virtual-storage-desc/vdu-storage-requirements</i>
 * 
 * <p>To create instances of this class use {@link VduStorageRequirementsBuilder}.
 * @see VduStorageRequirementsBuilder
 * @see VduStorageRequirementsKey
 *
 */
public interface VduStorageRequirements
    extends
    ChildOf<VirtualStorageDesc>,
    Augmentable<VduStorageRequirements>,
    Identifiable<VduStorageRequirementsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-storage-requirements");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.storage.desc.VduStorageRequirements> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.storage.desc.VduStorageRequirements.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable String getKey();
    
    /**
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable String getValue();
    
    @Override
    VduStorageRequirementsKey key();

}

