package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.Project1;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.NsdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * container nsd-catalog {
 *   list nsd {
 *     key id;
 *     uses nsd-descriptor;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/project/(urn:etsi:osm:yang:project-nsd?revision=2017-02-28)nsd-catalog</i>
 * 
 * <p>To create instances of this class use {@link NsdCatalogBuilder}.
 * @see NsdCatalogBuilder
 *
 */
public interface NsdCatalog
    extends
    ChildOf<Project1>,
    Augmentable<NsdCatalog>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-catalog");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.NsdCatalog> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.NsdCatalog.class;
    }
    
    /**
     * @return <code>java.util.Map</code> <code>nsd</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsdKey, Nsd> getNsd();
    
    /**
     * @return <code>java.util.Map</code> <code>nsd</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsdKey, Nsd> nonnullNsd() {
        return CodeHelpers.nonnull(getNsd());
    }

}

