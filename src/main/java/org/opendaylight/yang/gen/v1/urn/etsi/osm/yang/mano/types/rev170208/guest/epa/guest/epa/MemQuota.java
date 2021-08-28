package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.GuestEpa;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Memory quota describes the memory resource allocation policy. Limit and Reserve 
 * values are defined in MB
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container mem-quota {
 *   uses allocation-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/mem-quota</i>
 * 
 * <p>To create instances of this class use {@link MemQuotaBuilder}.
 * @see MemQuotaBuilder
 *
 */
public interface MemQuota
    extends
    ChildOf<GuestEpa>,
    Augmentable<MemQuota>,
    AllocationProperties
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("mem-quota");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.MemQuota> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.MemQuota.class;
    }

}

