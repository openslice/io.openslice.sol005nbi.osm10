package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsdDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.NsdCatalog;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list nsd {
 *   key id;
 *   uses nsd-descriptor;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/project/(urn:etsi:osm:yang:project-nsd?revision=2017-02-28)nsd-catalog/nsd</i>
 * 
 * <p>To create instances of this class use {@link NsdBuilder}.
 * @see NsdBuilder
 * @see NsdKey
 *
 */
public interface Nsd
    extends
    ChildOf<NsdCatalog>,
    Augmentable<Nsd>,
    NsdDescriptor,
    Identifiable<NsdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.Nsd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.Nsd.class;
    }
    
    @Override
    NsdKey key();

}

