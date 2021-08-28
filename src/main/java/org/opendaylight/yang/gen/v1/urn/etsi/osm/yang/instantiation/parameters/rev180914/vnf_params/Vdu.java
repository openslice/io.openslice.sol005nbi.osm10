package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VduParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list vdu {
 *   key id;
 *   uses vdu_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vnf_params/vdu</i>
 * 
 * <p>To create instances of this class use {@link VduBuilder}.
 * @see VduBuilder
 * @see VduKey
 *
 */
public interface Vdu
    extends
    ChildOf<VnfParams>,
    Augmentable<Vdu>,
    VduParams,
    Identifiable<VduKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.Vdu> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.Vdu.class;
    }
    
    @Override
    VduKey key();

}

