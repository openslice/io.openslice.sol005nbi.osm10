package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.Nsr;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VNFRs that are part of this network service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list constituent-vnfr-ref {
 *   key vnfr-id;
 *   leaf vnfr-id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-opdata/nsr/constituent-vnfr-ref</i>
 * 
 * <p>To create instances of this class use {@link ConstituentVnfrRefBuilder}.
 * @see ConstituentVnfrRefBuilder
 * @see ConstituentVnfrRefKey
 *
 */
public interface ConstituentVnfrRef
    extends
    ChildOf<Nsr>,
    Augmentable<ConstituentVnfrRef>,
    Identifiable<ConstituentVnfrRefKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-vnfr-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRef.class;
    }
    
    /**
     * Reference to the VNFR id This should be a leafref to
     * /vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id But due to confd bug (RIFT-9451), changing
     * to string.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrId</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfrId();
    
    @Override
    ConstituentVnfrRefKey key();

}

