package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.Vld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.VldKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsr-nsd-vld {
 *   list vld {
 *     key id;
 *     uses nsd-base:nsd-vld-common;
 *     list vnfd-connection-point-ref {
 *       key "member-vnf-index-ref vnfd-connection-point-ref";
 *       leaf member-vnf-index-ref {
 *         type leafref {
 *           path ../../../constituent-vnfd/member-vnf-index;
 *         }
 *       }
 *       leaf vnfd-id-ref {
 *         type string;
 *       }
 *       leaf vnfd-connection-point-ref {
 *         type leafref {
 *           path "../../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:connection-point/project-vnfd:name";
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vld</i>
 *
 */
public interface NsrNsdVld
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsr-nsd-vld");

    @Override
    Class<? extends NsrNsdVld> implementedInterface();
    
    /**
     * @return <code>java.util.Map</code> <code>vld</code>, or <code>null</code> if not present
     */
    @Nullable Map<VldKey, Vld> getVld();
    
    /**
     * @return <code>java.util.Map</code> <code>vld</code>, or an empty list if it is not present
     */
    default @NonNull Map<VldKey, Vld> nonnullVld() {
        return CodeHelpers.nonnull(getVld());
    }

}

