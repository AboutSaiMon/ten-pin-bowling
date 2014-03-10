/**
 * This file is part of Ten-Pin Bowling project.
 *
 * Ten-Pin Bowling is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *	
 * Ten-Pin Bowling is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *	
 * You should have received a copy of the GNU General Public License
 * along with this project. If not, see <http://www.gnu.org/licenses/>.
 */
package spa.simone.tenpinbowling.model;

/**
 * It is the superclass of all the program exceptions. It serves to unify the
 * exception handling.
 * 
 * @author Simone Spaccarotella {spa.simone@gmail.com}
 */
public class ScoreBoardException extends Exception {

	private static final long serialVersionUID = -7276390664716743306L;

	/**
	 * Constructs the exception, passing an error message that will be shown in
	 * the stack trace.
	 * 
	 * @param message
	 *           the error message.
	 */
	public ScoreBoardException(String message) {
		super(message);
	}

}
