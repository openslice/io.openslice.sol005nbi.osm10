package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.vnffgd.catalog;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.VnffgdCatalog;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnffgd</b>
 * <pre>
 * list vnffgd {
 *   key id;
 *   leaf name {
 *     type string;
 *   }
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf provider {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnffgd/project/(urn:etsi:osm:yang:vnffgd?revision=2017-02-08)vnffgd-catalog/vnffgd</i>
 * 
 * <p>To create instances of this class use {@link VnffgdBuilder}.
 * @see VnffgdBuilder
 * @see VnffgdKey
 *
 */
public interface Vnffgd
    extends
    ChildOf<VnffgdCatalog>,
    Augmentable<Vnffgd>,
    Identifiable<VnffgdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd.class;
    }
    
    /**
     * VNF Forwarding Graph Descriptor name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Identifier for the VNFFGD.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getId();
    
    /**
     * Provider of the VNFFGD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>provider</code>, or <code>null</code> if not present
     */
    @Nullable String getProvider();
    
    /**
     * Description of the VNFFGD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * Version of the VNFFGD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable String getVersion();
    
    @Override
    VnffgdKey key();

}

