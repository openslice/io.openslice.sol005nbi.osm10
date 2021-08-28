package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.vnf.dependency;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsdVnfDependency;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VNF dependencies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list vnf-dependency {
 *   key vnf-source-ref;
 *   leaf vnf-source-ref {
 *     type leafref {
 *       path ../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id;
 *     }
 *   }
 *   leaf vnf-depends-on-ref {
 *     type leafref {
 *       path ../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-vnf-dependency/vnf-dependency</i>
 * 
 * <p>To create instances of this class use {@link VnfDependencyBuilder}.
 * @see VnfDependencyBuilder
 * @see VnfDependencyKey
 *
 */
public interface VnfDependency
    extends
    ChildOf<NsdVnfDependency>,
    Augmentable<VnfDependency>,
    Identifiable<VnfDependencyKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-dependency");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.vnf.dependency.VnfDependency> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.vnf.dependency.VnfDependency.class;
    }
    
    /**
     * @return <code>java.lang.Object</code> <code>vnfSourceRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfSourceRef();
    
    /**
     * Reference to VNF that sorce VNF depends.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfDependsOnRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfDependsOnRef();
    
    @Override
    VnfDependencyKey key();

}

