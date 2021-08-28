package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.extended.vnf.configuration.Day12;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.extended.vnf.configuration.Day12Key;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>day1-2</b>
 * <pre>
 * grouping extended-vnf-configuration {
 *   list day1-2 {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     uses common:vnfc-configuration;
 *     uses common:vnfc-relations;
 *     uses common:vdu-config-access;
 *     leaf-list blacklist-config-primitive {
 *       type enumeration {
 *         enum upgrade;
 *         enum rollback;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>day1-2/extended-vnf-configuration</i>
 *
 */
public interface ExtendedVnfConfiguration
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-vnf-configuration");

    @Override
    Class<? extends ExtendedVnfConfiguration> implementedInterface();
    
    /**
     * @return <code>java.util.Map</code> <code>day12</code>, or <code>null</code> if not present
     */
    @Nullable Map<Day12Key, Day12> getDay12();
    
    /**
     * @return <code>java.util.Map</code> <code>day12</code>, or an empty list if it is not present
     */
    default @NonNull Map<Day12Key, Day12> nonnullDay12() {
        return CodeHelpers.nonnull(getDay12());
    }

}

