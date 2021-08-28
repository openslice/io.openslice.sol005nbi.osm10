package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * container SNSSAI-identifier {
 *   uses snssai;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/SNSSAI-identifier</i>
 * 
 * <p>To create instances of this class use {@link SNSSAIIdentifierBuilder}.
 * @see SNSSAIIdentifierBuilder
 *
 */
public interface SNSSAIIdentifier
    extends
    ChildOf<NetworkSlice>,
    Augmentable<SNSSAIIdentifier>,
    Snssai
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("SNSSAI-identifier");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.SNSSAIIdentifier> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.SNSSAIIdentifier.class;
    }

}

