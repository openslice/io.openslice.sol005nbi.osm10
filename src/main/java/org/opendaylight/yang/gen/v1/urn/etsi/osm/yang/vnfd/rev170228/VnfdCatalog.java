package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.rev170228.vnfd.catalog.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.rev170228.vnfd.catalog.VnfdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Virtual Network Function Descriptor (VNFD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * container vnfd-catalog {
 *   leaf schema-version {
 *     type string;
 *     default v3.0;
 *   }
 *   list vnfd {
 *     key id;
 *     uses vnfd-base:vnfd-descriptor;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd/vnfd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnfdCatalogBuilder}.
 * @see VnfdCatalogBuilder
 *
 */
public interface VnfdCatalog
    extends
    ChildOf<VnfdData>,
    Augmentable<VnfdCatalog>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-catalog");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.rev170228.VnfdCatalog> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.rev170228.VnfdCatalog.class;
    }
    
    /**
     * Schema version for the VNFD. If unspecified, it assumes v3.0
     *
     *
     *
     * @return <code>java.lang.String</code> <code>schemaVersion</code>, or <code>null</code> if not present
     */
    @Nullable String getSchemaVersion();
    
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

