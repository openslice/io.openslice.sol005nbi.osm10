package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * list nsi {
 *   key id;
 *   unique name;
 *   uses nsi;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi</i>
 * 
 * <p>To create instances of this class use {@link NsiBuilder}.
 * @see NsiBuilder
 * @see NsiKey
 *
 */
public interface Nsi
    extends
    ChildOf<NsiData>,
    Augmentable<Nsi>,
    Nsi$G,
    Identifiable<NsiKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsi");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi.class;
    }
    
    @Override
    NsiKey key();

}

