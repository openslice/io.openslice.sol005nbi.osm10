package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.sw.image.desc;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ChecksumAlgorithm;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDesc;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The checksum of the software image file.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container checksum {
 *   leaf algorithm {
 *     type identityref {
 *       base checksum-algorithm;
 *     }
 *   }
 *   leaf hash {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/sw-image-desc/checksum</i>
 * 
 * <p>To create instances of this class use {@link ChecksumBuilder}.
 * @see ChecksumBuilder
 *
 */
public interface Checksum
    extends
    ChildOf<SwImageDesc>,
    Augmentable<Checksum>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("checksum");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.sw.image.desc.Checksum> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.sw.image.desc.Checksum.class;
    }
    
    /**
     * Species the algorithm used to obtain the checksum value.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>algorithm</code>, or <code>null</code> if not present
     */
    @Nullable Class<? extends ChecksumAlgorithm> getAlgorithm();
    
    /**
     * Contains the result of applying the algorithm indicated by the algorithm
     * attribute to the data to which this ChecksumData refers.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>hash</code>, or <code>null</code> if not present
     */
    @Nullable String getHash();

}

