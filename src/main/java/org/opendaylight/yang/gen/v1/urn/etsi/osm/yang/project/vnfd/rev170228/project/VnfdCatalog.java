package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.Project1;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.vnfd.catalog.VnfdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Virtual Network Function Descriptor (VNFD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-vnfd</b>
 * <pre>
 * container vnfd-catalog {
 *   list vnfd {
 *     key id;
 *     uses vnfd-base:vnfd-descriptor;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-vnfd/project/(urn:etsi:osm:yang:project-vnfd?revision=2017-02-28)vnfd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnfdCatalogBuilder}.
 * @see VnfdCatalogBuilder
 *
 */
public interface VnfdCatalog
    extends
    ChildOf<Project1>,
    Augmentable<VnfdCatalog>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-catalog");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.VnfdCatalog> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.VnfdCatalog.class;
    }
    
    /**
     * @return <code>java.util.Map</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfdKey, Vnfd> getVnfd();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfd</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfdKey, Vnfd> nonnullVnfd() {
        return CodeHelpers.nonnull(getVnfd());
    }

}

