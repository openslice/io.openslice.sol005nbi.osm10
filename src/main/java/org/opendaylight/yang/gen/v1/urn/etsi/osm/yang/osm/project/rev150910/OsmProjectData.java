package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * This yang module defines project-based tenancy for RIFT.ware. Authorization for 
 * project access is defined in terms of RIFT.ware's Role-Based Access Control 
 * (RBAC) model.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>osm-project</b>
 * <pre>
 * module osm-project {
 *   namespace urn:etsi:osm:yang:osm-project;
 *   prefix osm-project;
 *   revision 2015-09-10 {
 *   }
 *   list project {
 *     key name;
 *     leaf name {
 *       type string {
 *         length 1..255;
 *       }
 *     }
 *     leaf description {
 *       type string;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface OsmProjectData
    extends
    DataRoot
{




    /**
     * Configuration and state for individual projects. RIFT.ware applications and
     * projects are expected to augment this list in order to add configuration for
     * projects that is specific to the product or application. As such, this list
     * contains minimal data defined in this yang module. When augmenting this element,
     * other yang modules should prefer to define containers with the same name as the
     * augmenting module. (Augmenting RIFT.ware modules should prefer to augment
     * without the rw prefix [for new features], or should prefer to augment the
     * augmented container of an existing augment, to ease future adoption and/or
     * standardization.)
     *
     *
     *
     * @return <code>java.util.Map</code> <code>project</code>, or <code>null</code> if not present
     */
    @Nullable Map<ProjectKey, Project> getProject();
    
    /**
     * @return <code>java.util.Map</code> <code>project</code>, or an empty list if it is not present
     */
    default @NonNull Map<ProjectKey, Project> nonnullProject() {
        return CodeHelpers.nonnull(getProject());
    }

}

