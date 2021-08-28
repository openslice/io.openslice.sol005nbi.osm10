package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * container quality-of-service {
 *   uses five-qi;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/quality-of-service</i>
 * 
 * <p>To create instances of this class use {@link QualityOfServiceBuilder}.
 * @see QualityOfServiceBuilder
 *
 */
public interface QualityOfService
    extends
    ChildOf<NetworkSlice>,
    Augmentable<QualityOfService>,
    FiveQi
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("quality-of-service");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.QualityOfService> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.QualityOfService.class;
    }

}

