package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfdKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsd-constituent-vnfd {
 *   list constituent-vnfd {
 *     key member-vnf-index;
 *     leaf member-vnf-index {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "/osm-project:project[osm-project:name = current()/../../../../osm-project:name]/project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id";
 *       }
 *     }
 *     leaf start-by-default {
 *       type boolean;
 *       default true;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-constituent-vnfd</i>
 *
 */
public interface NsdConstituentVnfd
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-constituent-vnfd");

    @Override
    Class<? extends NsdConstituentVnfd> implementedInterface();
    
    /**
     * List of VNFDs that are part of this network service.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>constituentVnfd</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConstituentVnfdKey, ConstituentVnfd> getConstituentVnfd();
    
    /**
     * @return <code>java.util.Map</code> <code>constituentVnfd</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConstituentVnfdKey, ConstituentVnfd> nonnullConstituentVnfd() {
        return CodeHelpers.nonnull(getConstituentVnfd());
    }

}

