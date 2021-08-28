package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list vld {
 *   key name;
 *   uses vld_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ns_params/vld</i>
 * 
 * <p>To create instances of this class use {@link VldBuilder}.
 * @see VldBuilder
 * @see VldKey
 *
 */
public interface Vld
    extends
    ChildOf<NsParams>,
    Augmentable<Vld>,
    VldParams,
    Identifiable<VldKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vld");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.Vld> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.Vld.class;
    }
    
    @Override
    VldKey key();

}

