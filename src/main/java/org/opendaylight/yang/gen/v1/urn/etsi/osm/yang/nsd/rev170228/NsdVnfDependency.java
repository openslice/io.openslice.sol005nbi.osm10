package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vnf.dependency.VnfDependency;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vnf.dependency.VnfDependencyKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-vnf-dependency {
 *   list vnf-dependency {
 *     key vnf-source-ref;
 *     leaf vnf-source-ref {
 *       type leafref {
 *         path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id;
 *       }
 *     }
 *     leaf vnf-depends-on-ref {
 *       type leafref {
 *         path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-vnf-dependency</i>
 *
 */
public interface NsdVnfDependency
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-vnf-dependency");

    @Override
    Class<? extends NsdVnfDependency> implementedInterface();
    
    /**
     * List of VNF dependencies.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfDependency</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfDependencyKey, VnfDependency> getVnfDependency();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfDependency</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfDependencyKey, VnfDependency> nonnullVnfDependency() {
        return CodeHelpers.nonnull(getVnfDependency());
    }

}

