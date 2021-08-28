package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Configuration and state for individual projects. RIFT.ware applications and 
 * projects are expected to augment this list in order to add configuration for 
 * projects that is specific to the product or application. As such, this list 
 * contains minimal data defined in this yang module. When augmenting this 
 * other yang modules should prefer to define containers with the same name as the 
 * augmenting module. (Augmenting RIFT.ware modules should prefer to augment 
 * without the rw prefix [for new features], or should prefer to augment the 
 * augmented container of an existing augment, to ease future adoption and/or 
 * standardization.)
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>osm-project</b>
 * <pre>
 * list project {
 *   key name;
 *   leaf name {
 *     type string {
 *       length 1..255;
 *     }
 *   }
 *   leaf description {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>osm-project/project</i>
 * 
 * <p>To create instances of this class use {@link ProjectBuilder}.
 * @see ProjectBuilder
 * @see ProjectKey
 *
 */
public interface Project
    extends
    ChildOf<OsmProjectData>,
    Augmentable<Project>,
    Identifiable<ProjectKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("project");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.Project> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.Project.class;
    }
    
    /**
     * Name of the project.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Information about project
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    @Override
    ProjectKey key();

}

