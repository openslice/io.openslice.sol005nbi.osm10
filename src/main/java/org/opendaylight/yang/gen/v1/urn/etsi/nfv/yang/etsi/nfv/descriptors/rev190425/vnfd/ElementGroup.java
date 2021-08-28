package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes the associated elements of a VNFD for a certain purpose during VNF 
 * lifecycle management.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list element-group {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf-list vdu {
 *     type leafref {
 *       path ../../vdu/id;
 *     }
 *   }
 *   leaf-list virtual-link-desc {
 *     type leafref {
 *       path ../../int-virtual-link-desc/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/element-group</i>
 * 
 * <p>To create instances of this class use {@link ElementGroupBuilder}.
 * @see ElementGroupBuilder
 * @see ElementGroupKey
 *
 */
public interface ElementGroup
    extends
    ChildOf<Vnfd>,
    Augmentable<ElementGroup>,
    Identifiable<ElementGroupKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("element-group");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ElementGroup> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ElementGroup.class;
    }
    
    /**
     * Unique identifier of this group in the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Human readable description of the group.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * References to Vdus that are part of this group.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vdu</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getVdu();
    
    /**
     * References to VnfVirtualLinkDesc that are part of this group.
     *
     *
     *
     * @return <code>java.util.List</code> <code>virtualLinkDesc</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getVirtualLinkDesc();
    
    @Override
    ElementGroupKey key();

}

