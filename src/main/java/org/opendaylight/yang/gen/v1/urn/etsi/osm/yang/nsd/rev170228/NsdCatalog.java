package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.catalog.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.catalog.NsdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * container nsd-catalog {
 *   leaf schema-version {
 *     type string;
 *     default v3.0;
 *   }
 *   list nsd {
 *     key id;
 *     uses nsd-base:nsd-descriptor-common;
 *     uses nsd-vld;
 *     uses nsd-constituent-vnfd;
 *     uses nsd-placement-groups;
 *     uses nsd-vnf-dependency;
 *     uses nsd-monitoring-param;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-catalog</i>
 * 
 * <p>To create instances of this class use {@link NsdCatalogBuilder}.
 * @see NsdCatalogBuilder
 *
 */
public interface NsdCatalog
    extends
    ChildOf<NsdData>,
    Augmentable<NsdCatalog>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-catalog");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdCatalog> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdCatalog.class;
    }
    
    /**
     * Schema version for the NSD. If unspecified, it assumes v3.0
     *
     *
     *
     * @return <code>java.lang.String</code> <code>schemaVersion</code>, or <code>null</code> if not present
     */
    @Nullable String getSchemaVersion();
    
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

