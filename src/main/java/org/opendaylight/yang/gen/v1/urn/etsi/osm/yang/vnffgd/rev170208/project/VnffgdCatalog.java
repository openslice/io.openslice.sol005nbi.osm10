package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.Project1;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.vnffgd.catalog.VnffgdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnffgd</b>
 * <pre>
 * container vnffgd-catalog {
 *   list vnffgd {
 *     key id;
 *     leaf name {
 *       type string;
 *     }
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf provider {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf version {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnffgd/project/(urn:etsi:osm:yang:vnffgd?revision=2017-02-08)vnffgd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnffgdCatalogBuilder}.
 * @see VnffgdCatalogBuilder
 *
 */
public interface VnffgdCatalog
    extends
    ChildOf<Project1>,
    Augmentable<VnffgdCatalog>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd-catalog");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.VnffgdCatalog> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.VnffgdCatalog.class;
    }
    
    /**
     * @return <code>java.util.Map</code> <code>vnffgd</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnffgdKey, Vnffgd> getVnffgd();
    
    /**
     * @return <code>java.util.Map</code> <code>vnffgd</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnffgdKey, Vnffgd> nonnullVnffgd() {
        return CodeHelpers.nonnull(getVnffgd());
    }

}

