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
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes the modifiable attributes of the VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container modifiable-attributes {
 *   leaf-list extension {
 *     type string;
 *   }
 *   leaf-list metadata {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/modifiable-attributes</i>
 * 
 * <p>To create instances of this class use {@link ModifiableAttributesBuilder}.
 * @see ModifiableAttributesBuilder
 *
 */
public interface ModifiableAttributes
    extends
    ChildOf<Vnfd>,
    Augmentable<ModifiableAttributes>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("modifiable-attributes");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ModifiableAttributes> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ModifiableAttributes.class;
    }
    
    /**
     * Additional VNF-specific attributes of VnfInfo that affect the lifecycle
     * management of a VNF instance and that are writeable. For each VNF instance,
     * these attributes are stored persistently by the VNFM and can be queried and
     * modified through the VNFM. These attributes are intended to be consumed by the
     * VNFM or by the lifecycle management scripts during the execution of VNF
     * lifecycle management operations. Modifying these values has no direct effect on
     * the VNF instance; however, modified values can be considered during subsequent
     * VNF lifecycle management operations, which means that the modified values can
     * indirectly affect the configuration of the VNF instance.
     *
     *
     *
     * @return <code>java.util.List</code> <code>extension</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getExtension();
    
    /**
     * Additional VNF-specific attributes of VnfInfo that are writeable and that
     * provide metadata describing the VNF instance. For each VNF instance, these
     * attributes are stored persistently by the VNFM and can be queried and modified
     * through the VNFM. These attributes are intended to provide information to
     * functional blocks external to the VNFM and will not be used by the VNFM or the
     * VNF lifecycle management scripts when executing lifecycle management operations.
     * Modifying these attributes has no effect on the VNF instance. It only affects
     * the attribute values stored by the VNFM.
     *
     *
     *
     * @return <code>java.util.List</code> <code>metadata</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getMetadata();

}

