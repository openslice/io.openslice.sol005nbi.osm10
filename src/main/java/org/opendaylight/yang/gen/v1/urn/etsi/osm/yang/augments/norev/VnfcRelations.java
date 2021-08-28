package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.relations.Relation;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.relations.RelationKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * grouping vnfc-relations {
 *   list relation {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list entities {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf endpoint {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/vnfc-relations</i>
 *
 */
public interface VnfcRelations
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfc-relations");

    @Override
    Class<? extends VnfcRelations> implementedInterface();
    
    /**
     * List of relations between elements in this descriptor.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>relation</code>, or <code>null</code> if not present
     */
    @Nullable Map<RelationKey, Relation> getRelation();
    
    /**
     * @return <code>java.util.Map</code> <code>relation</code>, or an empty list if it is not present
     */
    default @NonNull Map<RelationKey, Relation> nonnullRelation() {
        return CodeHelpers.nonnull(getRelation());
    }

}

