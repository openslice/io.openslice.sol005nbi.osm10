package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Vdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * The key indicates the boot index (lowest index defines highest boot priority). 
 * The Value references a descriptor from which a valid boot device is created 
 * VirtualStorageDesc from which a VirtualStorage instance is created. Editor's 
 * note: The boot-order node requires further study.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list boot-order {
 *   ordered-by user;
 *   key key;
 *   leaf key {
 *     type uint32;
 *   }
 *   leaf value {
 *     type leafref {
 *       path ../../virtual-storage-desc;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/vdu/boot-order</i>
 * 
 * <p>To create instances of this class use {@link BootOrderBuilder}.
 * @see BootOrderBuilder
 * @see BootOrderKey
 *
 */
public interface BootOrder
    extends
    ChildOf<Vdu>,
    Augmentable<BootOrder>,
    Identifiable<BootOrderKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("boot-order");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.BootOrder> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.BootOrder.class;
    }
    
    /**
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getKey();
    
    /**
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable String getValue();
    
    @Override
    BootOrderKey key();

}

